//Clayton Szelestey
//Project 2
//5/8/17
//High Score Compiler
import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighScoreCompiler {

	public static void main(String[] args) {
		Score[] x = null;
		ConcatenateScoreFiles(finder(System.getProperty("user.dir")));
		x = SortScore(new File("compiledScores.txt"));
		//lim is total number of scores
		int lim = numberOfLines(new File("Sorted_compiledScores.txt"));
		System.out.print("How many top scores would you like displayed on the leaderboards: ");
		Scanner input = new Scanner(System.in);
		int top = 0;
		try{
			top = input.nextInt();
			input.close();
		}catch(Exception e){
			System.out.println("Number of Top Scores Input Error");
			System.exit(0);
		}
		//checks to make sure requested number of scores is possible
		if(top <= lim && top >=0)
		{
			ExportHTML(x, top);
			System.out.println("Complete");
		}
		else
			System.out.println("Number of Top Scores Range Error");
	}
	
	//takes .txt files in and creates a single .txt file
	public static void ConcatenateScoreFiles(File... input){
		String newline = System.getProperty("line.separator");
		String outputText = "";
		try{
			for(int x = 0; x < input.length; x++){
				
				Scanner fileScanner = new Scanner(input[x]);
				while(fileScanner.hasNextLine()){
					outputText += fileScanner.nextLine() + newline;
				}
				fileScanner.close();
			}
		}catch (Exception e) {
			System.out.println("Error 1");
			System.exit(0);
			return;
		}
		PrintWriter writer;
		try {
			writer = new PrintWriter("compiledScores.txt", "UTF-8");
			writer.println(outputText);
			writer.close();
		} catch (Exception e) {
			System.out.println("Error 2");
			System.exit(0);
			return;
		} 
	}
	
	//takes in a single file of scores and creates a new sorted file, returns an array of scores
	public static Score[] SortScore(File input){
		String newline = System.getProperty("line.separator");
		String username;
		String temp;
		int lines = numberOfLines(input);
		int counter = 0;
		int score;
		Score[] scores = new Score[lines];
		
		try {
			Scanner fileScanner = new Scanner(input);
			
			while(counter<lines){
				temp = fileScanner.next();
				username = temp;
				temp = fileScanner.next();
				score = fileScanner.nextInt();
				scores[counter] = new Score(username, score);
				counter++;		
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Score File Format Error");
			System.exit(0);
			return null;
		}
		insertionSort(scores);
		temp = "";
		for(int i = 0; i < scores.length; i++){
			temp += scores[i].toString() + newline;
		}
		
		PrintWriter writer;
		try {
			writer = new PrintWriter("Sorted_" + input.getName(), "UTF-8");
			writer.println(temp);
			writer.close();
		} catch (Exception e) {
			System.out.println("Error 4");
			System.exit(0);
			return null;
		} 
		input.delete();
		return scores;
	}
	
	//takes in an array of sorted scores and a number and generates a webpage that displays the specified number of high scores
	public static void ExportHTML(Score[] scores, int top_x){
		try{
			PrintWriter writer;
			writer = new PrintWriter("Leaderboards.html", "UTF-8");		
			String html = "";
			html = 
					"<html lang=\"en\">"
					+ "\n<head>"
					+ "\n<meta charset=\"utf-8\" />"
					+ "\n<title>LeaderBoards</title>"
					+ "\n<style>"
					+ "\n@import url(http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100);"
					+ "\nbody {"
					+ "\nbackground-color: #3e94ec;"
					+ "\nfont-family: \"Roboto\", helvetica, arial, sans-serif;"
					+ "\nfont-size: 16px;"
					+ "\nfont-weight: 400;"
					+ "\ntext-rendering: optimizeLegibility;"
					+ "\n}"
					+ "\ndiv.table-title {"
					+ "\ndisplay: block;"
					+ "\nmargin: auto;"
					+ "\nmax-width: 600px;"
					+ "\npadding:5px;"
					+ "\nwidth: 100%;"
					+ "\n}"
					+ "\n.table-title h3 {"
					+ "\ncolor: #fafafa;"
					+ "\nfont-size: 30px;"
					+ "\nfont-weight: 400;"
					+ "\nfont-style:normal;"
					+ "\nfont-family: \"Roboto\", helvetica, arial, sans-serif;"
					+ "\ntext-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);"
					+ "\ntext-transform:uppercase;"
					+ "\n}"
					+ "\n.table-fill {"
					+ "\nbackground: white;"
					+ "\nborder-radius:3px;"
					+ "\nborder-collapse: collapse;"
					+ "\nheight: 320px;"
					+ "\nmargin: auto;"
					+ "\nmax-width: 600px;"
					+ "\npadding:5px;"
					+ "\nwidth: 100%;"
					+ "\nbox-shadow: 0 5px 10px rgba(0, 0, 0, 0.1);"
					+ "\nanimation: float 5s infinite;"
					+ "\n}"
					+ "\nth {"
					+ "\ncolor:#D5DDE5;;"
					+ "\nbackground:#1b1e24;"
					+ "\nborder-bottom:4px solid #9ea7af;"
					+ "\nborder-right: 1px solid #343a45;"
					+ "\nfont-size:23px;"
					+ "\nfont-weight: 100;"
					+ "\npadding:24px;"
					+ "\ntext-align:left;"
					+ "\ntext-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);"
					+ "\nvertical-align:middle;"
					+ "\n}"
					+ "\nth:first-child {"
					+ "\nborder-top-left-radius:3px;"
					+ "\n}"
					+ "\nth:last-child {"
					+ "\nborder-top-right-radius:3px;"
					+ "\nborder-right:none;"
					+ "\n}"
					+ "\ntr {"
					+ "\nborder-top: 1px solid #C1C3D1;"
					+ "\nborder-bottom-: 1px solid #C1C3D1;"
					+ "\ncolor:#666B85;"
					+ "\nfont-size:16px;"
					+ "\nfont-weight:normal;"
					+ "\ntext-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);"
					+ "\n}"
					+ "\ntr:hover td {"
					+ "\nbackground:#4E5066;"
					+ "\ncolor:#FFFFFF;"
					+ "\nborder-top: 1px solid #22262e;"
					+ "\nborder-bottom: 1px solid #22262e;"
					+ "\n}"
					+ "\ntr:first-child {"
					+ "\nborder-top:none;"
					+ "\n}"
					+ "\ntr:last-child {"
					+ "\nborder-bottom:none;"
					+ "\n}"
					+ "\ntr:nth-child(odd) td {"
					+ "\nbackground:#EBEBEB;"
					+ "\n}"
					+ "\ntr:nth-child(odd):hover td {"
					+ "\nbackground:#4E5066;"
					+ "\n}"
					+ "\ntr:last-child td:first-child {"
					+ "\nborder-bottom-left-radius:3px;"
					+ "\n}"
					+ "\ntr:last-child td:last-child {"
					+ "\nborder-bottom-right-radius:3px;"
					+ "\n}"
					+ "\ntd {"
					+ "\nbackground:#FFFFFF;"
					+ "\npadding:20px;"
					+ "\ntext-align:left;"
					+ "\nvertical-align:middle;"
					+ "\nfont-weight:300;"
					+ "\nfont-size:18px;"
					+ "\ntext-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);"
					+ "\nborder-right: 1px solid #C1C3D1;"
					+ "\n}"
					+ "\ntd:last-child {"
					+ "\nborder-right: 0px;"
					+ "\n}"
					+ "\nth.text-left {"
					+ "\ntext-align: left;"
					+ "\n}"
					+ "\nth.text-center {"
					+ "\ntext-align: center;"
					+ "\n}"
					+ "\nth.text-right {"
					+ "\ntext-align: right;"
					+ "\n}"
					+ "\ntd.text-left {"
					+ "\ntext-align: left;"
					+ "\n}"
					+ "\ntd.text-center {"
					+ "\ntext-align: center;"
					+ "\n}"
					+ "\ntd.text-right {"
					+ "\ntext-align: right;"
					+ "\n}"
					+ "\n</style>"
					+ "\n<meta name=\"viewport\" content=\"initial-scale=1.0; maximum-scale=1.0; width=device-width;\">"
					+ "\n</head>"
					+ "\n<body>"
					+ "\n<div class=\"table-title\">"
					+ "\n<h3>Leaderboards</h3>"
					+ "\n</div>"
					+ "\n<table class=\"table-fill\">"
					+ "\n<thead>"
					+ "\n<tr>"
					+ "\n<th class=\"text-left\">Player Name</th>"
					+ "\n<th class=\"text-left\">Score</th>"
					+ "\n</tr>"
					+ "\n</thead>"
					+ "\n<tbody class=\"table-hover\">";
			for(int i = 0; i < top_x; i++)
			{
				html +=
					"\n<tr>"
					+ "\n<td class=\"text-left\">" + scores[i].getUsername() + "</td>"
					+ "\n<td class=\"text-left\">" + scores[i].getScore() + "</td>"
					+ "\n</tr>";
			}
			html +=
					"\n</tbody>"
					+ "\n</table>  "
					+ "\n</body>";
			writer.println(html);
			writer.close();
		} catch (Exception e) {
			System.out.println("HTML Generation Error");
			System.exit(0);
			return;
		} 
		
	}
	
	//determines number of scores contained within a file
	public static int numberOfLines(File input){
		
		int counter = 0;
		try{
			Scanner fileScanner = new Scanner(input);
			while(fileScanner.hasNext()){
				fileScanner.next();
				fileScanner.next();
				if(fileScanner.hasNextInt()){
					fileScanner.nextInt();
					counter++;
				}
				else{
					System.out.println("Score File Format Error");
					System.exit(0);
				}
			}
			fileScanner.close();
			if(counter == 0){
				System.out.println("No Score Files Detected");
				System.exit(0);
				return counter;
			}
			return counter;
		}catch(Exception e){
			System.out.println("Error 5");
			System.exit(0);
			return 0;
		}
	}
	
	//takes in an array of scores and sorts them
	public static void insertionSort(Score[] scores)
	{
	   for (int i=1; i < scores.length; i++)
	   {
	      Score index = scores[i]; 
	      int j = i;
	      while (j > 0 && scores[j-1].getScore() < index.getScore())
	      {
	           scores[j] = scores[j-1];
	           j--;
	      }
	      scores[j] = index;
	   } 
	}
	
	//returns an array of all .txt files in a directory(not including .txt files generated by the program)
	public static File[] finder(String dirName)
	{
	    File dir = new File(dirName);

	    return dir.listFiles(new FilenameFilter() 
	    { 
	         public boolean accept(File dir, String filename)
	              { 
	        	 	  if(!filename.equals("Sorted_compiledScores.txt") && !filename.equals("compiledScores.txt")){
	            	  	return filename.endsWith(".txt"); 
	    			  }
	        	 	  else return false;
	        	 	  
	              }
	    } 
	    );
	}
}

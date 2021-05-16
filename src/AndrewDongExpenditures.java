//Developed by Andrew Dong
//December 8th, 2018
//Mr Kordbacheh   ICS3U    L'Amoreaux C.I.

//This program is a student expenditure calculator where the user can input values of their expenses.
//The user is also asked to provide information about themselves such as their name, age, etc.
//After using calculations the program offers a variety of outputs such as weekly expenditures, monthly expenditures and yearly expenditures.
//The program uses many images on JLabels for aesthetics and uses no layout which allows for manual location setting.
//Finally, the program also provides "tips" at the end for the user to save money to reach their expenses.

//Imports necessary java packages/classes to have functional GUI and perform other methods.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class AndrewDongExpenditures
{

    //Declares the frame that holds the entire program's outputs of JLabels, JButtons, etc.
    public static JFrame mainFrame = new JFrame ("University Expenditures Calculator");

    //Declares fonts for JLabels with text for manual adjustment of size and typeface.
    public static Font prompts = new Font ("Calibri", Font.PLAIN, 20);
    public static Font costs = new Font ("Calibri", Font.PLAIN, 16);
    public static Font output = new Font ("Calibri", Font.BOLD, 25);

    //Declares the colour used for the output texts
    public static Color blue = new Color (41, 170, 226);

    /////Image Icon declaration/////
    //Aesthetic/Regular Icons
    public static ImageIcon yuiAIIcon = new ImageIcon ("res/YUI.jpg");
    public static ImageIcon bannerIcon = new ImageIcon ("res/Banner.jpg");
    public static ImageIcon startAestheticIcon = new ImageIcon ("res/StartAesthetic.jpg");
    public static ImageIcon loadingIcon = new ImageIcon ("res/Loading.jpg");
    public static ImageIcon calculatingIcon = new ImageIcon ("res/Calculating.jpg");
    public static ImageIcon tipsIcon = new ImageIcon ("res/tips.jpg");

    //Button Icons
    public static ImageIcon startButtonIcon = new ImageIcon ("res/StartButton.jpg");
    public static ImageIcon yesIcon = new ImageIcon ("res/Yes.jpg");
    public static ImageIcon noIcon = new ImageIcon ("res/No.jpg");
    public static ImageIcon continueIcon = new ImageIcon ("res/CONTINUE.jpg");
    public static ImageIcon finishIcon = new ImageIcon ("res/FINISH.jpg");
    public static ImageIcon nextIcon = new ImageIcon ("res/NEXT.jpg");
    public static ImageIcon weeklyExpenditureIcon = new ImageIcon ("res/WeeklyExpenditure.jpg");
    public static ImageIcon monthlyExpenditureIcon = new ImageIcon ("res/MonthlyExpenditure.jpg");
    public static ImageIcon yearlyExpenditureIcon = new ImageIcon ("res/YearlyExpenditure.jpg");
    public static ImageIcon backIcon = new ImageIcon ("res/BACK.jpg");
    public static ImageIcon privateInfoIcon = new ImageIcon ("res/PrivateInfo.jpg");
    public static ImageIcon clearIcon = new ImageIcon ("res/CLEAR.jpg");
    public static ImageIcon saveMoneyIcon = new ImageIcon ("res/SAVEMONEY.jpg");

    //Title Icons
    public static ImageIcon userInfoIcon = new ImageIcon ("res/UserInfo.jpg");
    public static ImageIcon weeklyTitleIcon = new ImageIcon ("res/WeeklyTitle.jpg");
    public static ImageIcon monthlyTitleIcon = new ImageIcon ("res/MonthlyTitle.jpg");
    public static ImageIcon yearlyTitleIcon = new ImageIcon ("res/YearlyTitle.jpg");

    //Text Icons
    public static ImageIcon lock1Icon = new ImageIcon ("res/lock1.jpg");
    public static ImageIcon text1Icon = new ImageIcon ("res/text1.jpg");
    public static ImageIcon text2Icon = new ImageIcon ("res/text2.jpg");
    public static ImageIcon text3Icon = new ImageIcon ("res/text3.jpg");
    public static ImageIcon text4Icon = new ImageIcon ("res/text4.jpg");
    public static ImageIcon text5Icon = new ImageIcon ("res/text5.jpg");
    public static ImageIcon text6Icon = new ImageIcon ("res/text6.jpg");
    public static ImageIcon text7Icon = new ImageIcon ("res/text7.jpg");
    public static ImageIcon text8Icon = new ImageIcon ("res/text8.jpg");
    public static ImageIcon text9Icon = new ImageIcon ("res/text9.jpg");
    public static ImageIcon text10Icon = new ImageIcon ("res/text10.jpg");

    /////JLabel declaration/////
    //Aesthetic/Regular Labels
    public static JLabel yuiAI = new JLabel (yuiAIIcon);
    public static JLabel banner = new JLabel (bannerIcon);
    public static JLabel startAesthetic = new JLabel (startAestheticIcon);
    public static JLabel background = new JLabel ();
    public static JLabel lock1 = new JLabel (lock1Icon);
    public static JLabel moneySign1 = new JLabel ();
    public static JLabel moneySign2 = new JLabel ();
    public static JLabel moneySign3 = new JLabel ();
    public static JLabel moneySign4 = new JLabel ();
    public static JLabel moneySign5 = new JLabel ();
    public static JLabel moneySign6 = new JLabel ();

    //Transition Labels
    public static JLabel loadingBar1 = new JLabel ();
    public static JLabel loadingBar2 = new JLabel ();
    public static JLabel loading = new JLabel (loadingIcon);
    public static JLabel calculatingBar1 = new JLabel ();
    public static JLabel calculatingBar2 = new JLabel ();
    public static JLabel calculating = new JLabel (calculatingIcon);

    //Text Labels
    public static JLabel text1 = new JLabel (text1Icon);
    public static JLabel text2 = new JLabel (text2Icon);
    public static JLabel text3 = new JLabel (text3Icon);
    public static JLabel text4 = new JLabel (text4Icon);
    public static JLabel text5 = new JLabel (text5Icon);
    public static JLabel text6 = new JLabel (text6Icon);
    public static JLabel text7 = new JLabel (text7Icon);
    public static JLabel text8 = new JLabel (text8Icon);
    public static JLabel text9 = new JLabel (text9Icon);
    public static JLabel text10 = new JLabel (text10Icon);

    ////Prompt Labels
    //Personal Information
    public static JLabel name = new JLabel ();
    public static JLabel age = new JLabel ();
    public static JLabel gender = new JLabel ();
    public static JLabel residency = new JLabel ();
    public static JLabel university = new JLabel ();
    public static JLabel summerSchool = new JLabel ();
    //Cost Information
    public static JLabel tuition = new JLabel ();
    public static JLabel books = new JLabel ();
    public static JLabel accomodation = new JLabel ();
    public static JLabel food = new JLabel ();
    public static JLabel entertainment = new JLabel ();
    public static JLabel clothing = new JLabel ();
    public static JLabel laundry = new JLabel ();
    public static JLabel transportation1 = new JLabel ();
    public static JLabel transportation2 = new JLabel ();
    public static JLabel grooming = new JLabel ();
    public static JLabel other = new JLabel ();
    public static JLabel summerSchoolCost = new JLabel ();

    //Title Labels
    public static JLabel userInfo = new JLabel (userInfoIcon);
    public static JLabel weeklyTitle = new JLabel (weeklyTitleIcon);
    public static JLabel monthlyTitle = new JLabel (monthlyTitleIcon);
    public static JLabel yearlyTitle = new JLabel (yearlyTitleIcon);

    ////Outputs Labels
    //Personal Information
    public static JLabel nameO = new JLabel ();
    public static JLabel ageO = new JLabel ();
    public static JLabel genderO = new JLabel ();
    public static JLabel residencyO = new JLabel ();
    public static JLabel universityO = new JLabel ();
    //Total Expenditures
    public static JLabel yearlyEO = new JLabel ();
    public static JLabel monthlyEO = new JLabel ();
    public static JLabel weeklyEO = new JLabel ();
    //Yearly Expenses
    public static JLabel tuitionYO = new JLabel ();
    public static JLabel booksYO = new JLabel ();
    public static JLabel accomodationYO = new JLabel ();
    public static JLabel foodYO = new JLabel ();
    public static JLabel clothingYO = new JLabel ();
    public static JLabel laundryYO = new JLabel ();
    public static JLabel transportation1YO = new JLabel ();
    public static JLabel transportation2YO = new JLabel ();
    public static JLabel groomingYO = new JLabel ();
    public static JLabel otherYO = new JLabel ();
    public static JLabel summerSchoolCostYO = new JLabel ();
    public static JLabel entertainmentYO = new JLabel ();
    //Monthly Expenses
    public static JLabel tuitionMO = new JLabel ();
    public static JLabel booksMO = new JLabel ();
    public static JLabel accomodationMO = new JLabel ();
    public static JLabel foodMO = new JLabel ();
    public static JLabel clothingMO = new JLabel ();
    public static JLabel laundryMO = new JLabel ();
    public static JLabel transportation1MO = new JLabel ();
    public static JLabel transportation2MO = new JLabel ();
    public static JLabel groomingMO = new JLabel ();
    public static JLabel otherMO = new JLabel ();
    public static JLabel summerSchoolCostMO = new JLabel ();
    public static JLabel entertainmentMO = new JLabel ();
    //Weekly Expenses
    public static JLabel tuitionWO = new JLabel ();
    public static JLabel booksWO = new JLabel ();
    public static JLabel accomodationWO = new JLabel ();
    public static JLabel foodWO = new JLabel ();
    public static JLabel clothingWO = new JLabel ();
    public static JLabel laundryWO = new JLabel ();
    public static JLabel transportation1WO = new JLabel ();
    public static JLabel transportation2WO = new JLabel ();
    public static JLabel groomingWO = new JLabel ();
    public static JLabel otherWO = new JLabel ();
    public static JLabel summerSchoolCostWO = new JLabel ();
    public static JLabel entertainmentWO = new JLabel ();
    public static JLabel tips = new JLabel (tipsIcon);

    /////JButton declaration/////
    //Regular Buttons
    public static JButton yes = new JButton (yesIcon);
    public static JButton no = new JButton (noIcon);
    public static JButton clearButton1 = new JButton (clearIcon);
    public static JButton clearButton2 = new JButton (clearIcon);

    //Transition Buttons
    public static JButton backButton = new JButton (backIcon);
    public static JButton startButton = new JButton (startButtonIcon);
    public static JButton continueButton = new JButton (continueIcon);
    public static JButton finishButton = new JButton (finishIcon);
    public static JButton nextButton = new JButton (nextIcon);

    //Output Buttons
    public static JButton privateInfoButton = new JButton (privateInfoIcon);
    public static JButton weeklyExpenditureButton = new JButton (weeklyExpenditureIcon);
    public static JButton monthlyExpenditureButton = new JButton (monthlyExpenditureIcon);
    public static JButton yearlyExpenditureButton = new JButton (yearlyExpenditureIcon);
    public static JButton saveMoneyButton = new JButton (saveMoneyIcon);

    /////JTextField declaration/////
    //Personal Info Input
    public static JTextField nameTF = new JTextField ();
    public static JTextField ageTF = new JTextField ();
    public static JTextField genderTF = new JTextField ();
    public static JTextField residencyTF = new JTextField ();
    public static JTextField universityTF = new JTextField ();

    //Costs/Fees Input
    public static JTextField tuitionTF = new JTextField ();
    public static JTextField booksTF = new JTextField ();
    public static JTextField accomodationTF = new JTextField ();
    public static JTextField foodTF = new JTextField ();
    public static JTextField entertainmentTF = new JTextField ();
    public static JTextField clothingTF = new JTextField ();
    public static JTextField laundryTF = new JTextField ();
    public static JTextField transportation1TF = new JTextField ();
    public static JTextField transportation2TF = new JTextField ();
    public static JTextField groomingTF = new JTextField ();
    public static JTextField otherTF = new JTextField ();
    public static JTextField summerSchoolCostTF = new JTextField ();

    /////String declaration/////
    //(Strings are used to gather data from textfields)
    //Personal Info Strings
    public static String nameS, ageS, genderS, residencyS, universityS;
    //Costs/Fees Strings
    public static String tuitionS, booksS, accomodationS, foodS, entertainmentS, clothingS, laundryS, transportation1S, transportation2S, groomingS, otherS, summerSchoolCostS;

    /////Integer/Double declaration/////
    //Regular/Aesthetic Integers
    public static int loadingBarX = 0, loadScreen = 0, summerSchoolResponse = 0, calculatingBarX = 0, calculateScreen = 0;
    //Error Checking Integers (used to prevent users from inputting letters/symbols for parsing)
    public static int tuitionE = 0, booksE = 0, accomodationE = 0, foodE = 0, entertainmentE = 0, clothingE = 0, laundryE = 0, transportation1E = 0, transportation2E = 0, groomingE, otherE = 0, summerSchoolCostE = 0;

    //Daily Value doubles
    public static double transportation1D = 0;
    //Weekly Value doubles
    public static double tuitionW = 0, booksW = 0, accomodationW = 0, foodW = 0, entertainmentW = 0, clothingW = 0, laundryW = 0, transportation1W = 0, transportation2W = 0, groomingW = 0, otherW = 0, summerSchoolCostW = 0;
    //Monthly Value doubles
    public static double tuitionM = 0, booksM = 0, accomodationM = 0, foodM = 0, entertainmentM = 0, clothingM = 0, laundryM = 0, transportation1M = 0, transportation2M = 0, groomingM = 0, otherM = 0, summerSchoolCostM = 0;
    //Yearly Value doubles
    public static double tuitionY = 0, booksY = 0, accomodationY = 0, foodY = 0, entertainmentY = 0, clothingY = 0, laundryY = 0, transportation1Y = 0, transportation2Y = 0, groomingY = 0, otherY = 0, summerSchoolCostY = 0;
    //Total Values
    public static double monthlyE = 0, weeklyE = 0, yearlyE = 0;

    public static void main (String[] args)
    {
	//Main Frame Settings
	//Allows the frame to be closed
	mainFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	//Sets the location on the screen
	mainFrame.setLocation (new Point (240, 100));
	//Sets the size
	mainFrame.setSize (new Dimension (405, 620));
	//Removes the layout by setting it to null, allows for manual placement of contents.
	mainFrame.getContentPane ().setLayout (null);
	//Prevents the size of the frame from being adjusted.
	mainFrame.setResizable (false);


	/////OPENING SCREEN/////
	//Sets the location and size of labels/buttons
	banner.setBounds (0, 0, 400, 100);
	yuiAI.setBounds (14, 137, 58, 61);
	text1.setBounds (79, 113, 311, 61);
	text2.setBounds (79, 186, 311, 61);
	startAesthetic.setBounds (0, 240, 400, 341);
	startButton.setBounds (130, 345, 142, 142);

	//Adds the action listeners to buttons
	startButton.addActionListener (new Commence ());

	//Removes the border surrounding the buttons
	startButton.setBorder (null);

	//Adds the contents to the frame
	mainFrame.getContentPane ().add (banner);
	mainFrame.getContentPane ().add (yuiAI);
	mainFrame.getContentPane ().add (text1);
	mainFrame.getContentPane ().add (text2);
	mainFrame.getContentPane ().add (startButton);
	mainFrame.getContentPane ().add (startAesthetic);


	/////PERSONAL INFO SCREEN/////
	////Sets the location and size of labels/buttons/textfields
	//Regular contents
	text3.setBounds (79, 113, 311, 61);
	text4.setBounds (79, 186, 311, 61);
	yes.setBounds (115, 440, 67, 67);
	no.setBounds (215, 440, 67, 67);
	continueButton.setBounds (100, 520, 197, 38);

	//Prompts for inputs
	name.setBounds (20, 255, 100, 20);
	age.setBounds (20, 285, 100, 20);
	gender.setBounds (20, 315, 100, 20);
	residency.setBounds (20, 345, 100, 20);
	university.setBounds (20, 375, 100, 20);
	summerSchool.setBounds (65, 415, 300, 20);

	//Textfields for inputs
	nameTF.setBounds (130, 255, 200, 20);
	ageTF.setBounds (130, 285, 200, 20);
	genderTF.setBounds (130, 315, 200, 20);
	residencyTF.setBounds (130, 345, 200, 20);
	universityTF.setBounds (130, 375, 200, 20);


	//Sets the font for the Labels with text
	name.setFont (prompts);
	age.setFont (prompts);
	gender.setFont (prompts);
	residency.setFont (prompts);
	university.setFont (prompts);
	summerSchool.setFont (prompts);

	//Sets the text of the prompts for personal info
	name.setText ("Name: ");
	age.setText ("Age: ");
	gender.setText ("Gender: ");
	residency.setText ("Residency: ");
	university.setText ("University: ");
	summerSchool.setText ("Are you taking summer school?");

	//Adds the action listeners to buttons
	yes.addActionListener (new YesAction ());
	no.addActionListener (new NoAction ());
	continueButton.addActionListener (new Continue ());

	//Removes the border surrounding the buttons
	yes.setBorder (null);
	no.setBorder (null);
	continueButton.setBorder (null);

	////Adds the contents to the frame
	//Regular contents
	mainFrame.getContentPane ().add (text3);
	mainFrame.getContentPane ().add (text4);
	mainFrame.getContentPane ().add (yes);
	mainFrame.getContentPane ().add (no);
	mainFrame.getContentPane ().add (continueButton);

	//Prompts
	mainFrame.getContentPane ().add (name);
	mainFrame.getContentPane ().add (age);
	mainFrame.getContentPane ().add (gender);
	mainFrame.getContentPane ().add (residency);
	mainFrame.getContentPane ().add (university);
	mainFrame.getContentPane ().add (summerSchool);

	//Textfields
	mainFrame.getContentPane ().add (nameTF);
	mainFrame.getContentPane ().add (ageTF);
	mainFrame.getContentPane ().add (genderTF);
	mainFrame.getContentPane ().add (residencyTF);
	mainFrame.getContentPane ().add (universityTF);

	//Sets the contents of the screen invisible until called upon
	//Regular contents
	text3.setVisible (false);
	text4.setVisible (false);
	yes.setVisible (false);
	no.setVisible (false);
	continueButton.setVisible (false);

	//Prompts
	name.setVisible (false);
	age.setVisible (false);
	gender.setVisible (false);
	residency.setVisible (false);
	university.setVisible (false);
	summerSchool.setVisible (false);

	//Textfields
	nameTF.setVisible (false);
	ageTF.setVisible (false);
	genderTF.setVisible (false);
	residencyTF.setVisible (false);
	universityTF.setVisible (false);


	/////COSTS INPUT SCREEN 1/////
	////Sets the location and size of labels/buttons/textfields
	//Regular contents
	text5.setBounds (79, 113, 311, 61);
	text6.setBounds (79, 186, 311, 61);
	nextButton.setBounds (60, 550, 197, 38);
	clearButton1.setBounds (280, 550, 111, 38);

	//Prompts for inputs
	tuition.setBounds (20, 255, 360, 20);
	books.setBounds (20, 302, 360, 20);
	accomodation.setBounds (20, 349, 360, 20);
	food.setBounds (20, 396, 360, 20);
	entertainment.setBounds (20, 443, 360, 20);
	laundry.setBounds (20, 490, 360, 20);

	//Dollar signs for aesthetics
	moneySign1.setBounds (20, 280, 300, 20);
	moneySign2.setBounds (20, 327, 300, 20);
	moneySign3.setBounds (20, 374, 300, 20);
	moneySign4.setBounds (20, 421, 300, 20);
	moneySign5.setBounds (20, 468, 300, 20);
	moneySign6.setBounds (20, 515, 300, 20);

	//Textfields for inputs
	tuitionTF.setBounds (30, 280, 300, 20);
	booksTF.setBounds (30, 327, 300, 20);
	accomodationTF.setBounds (30, 374, 300, 20);
	foodTF.setBounds (30, 421, 300, 20);
	entertainmentTF.setBounds (30, 468, 300, 20);
	laundryTF.setBounds (30, 515, 300, 20);

	////Sets the font for the Labels with text
	//Sets the font of the prompts
	tuition.setFont (costs);
	books.setFont (costs);
	accomodation.setFont (costs);
	food.setFont (costs);
	entertainment.setFont (costs);
	laundry.setFont (costs);

	//Sets the font of the aesthetical dollar signs
	moneySign1.setFont (costs);
	moneySign2.setFont (costs);
	moneySign3.setFont (costs);
	moneySign4.setFont (costs);
	moneySign5.setFont (costs);
	moneySign6.setFont (costs);

	//Sets the text of the labels
	//Sets the text of the prompts for costs
	tuition.setText ("Tuition Fee (per year):");
	books.setText ("Books/Stationary Fee (per month):");
	accomodation.setText ("Accomodation/Housing Fee (per month):");
	food.setText ("Food Fee (per week):");
	entertainment.setText ("Entertainment Fee (per week):");
	laundry.setText ("Laundry Fee (per week):");

	//Sets the text of the dollar sign aesthetics
	moneySign1.setText ("$ ");
	moneySign2.setText ("$ ");
	moneySign3.setText ("$ ");
	moneySign4.setText ("$ ");
	moneySign5.setText ("$ ");
	moneySign6.setText ("$ ");

	//Adds the action listeners to buttons
	nextButton.addActionListener (new Next ());
	clearButton1.addActionListener (new Clear1 ());

	//Removes the border surrounding the buttons
	nextButton.setBorder (null);
	clearButton1.setBorder (null);


	////Adds the contents to the frame
	//Regular contents
	mainFrame.getContentPane ().add (text5);
	mainFrame.getContentPane ().add (text6);
	mainFrame.getContentPane ().add (nextButton);
	mainFrame.getContentPane ().add (clearButton1);

	//Prompts
	mainFrame.getContentPane ().add (tuition);
	mainFrame.getContentPane ().add (books);
	mainFrame.getContentPane ().add (accomodation);
	mainFrame.getContentPane ().add (food);
	mainFrame.getContentPane ().add (entertainment);
	mainFrame.getContentPane ().add (laundry);

	//Textfields
	mainFrame.getContentPane ().add (tuitionTF);
	mainFrame.getContentPane ().add (booksTF);
	mainFrame.getContentPane ().add (accomodationTF);
	mainFrame.getContentPane ().add (foodTF);
	mainFrame.getContentPane ().add (entertainmentTF);
	mainFrame.getContentPane ().add (laundryTF);

	//Aesthetics
	mainFrame.getContentPane ().add (moneySign1);
	mainFrame.getContentPane ().add (moneySign2);
	mainFrame.getContentPane ().add (moneySign3);
	mainFrame.getContentPane ().add (moneySign4);
	mainFrame.getContentPane ().add (moneySign5);
	mainFrame.getContentPane ().add (moneySign6);

	//Sets the contents of the screen invisible until called upon
	//Regular contents
	text5.setVisible (false);
	text6.setVisible (false);
	nextButton.setVisible (false);
	clearButton1.setVisible (false);

	//Prompts
	tuition.setVisible (false);
	books.setVisible (false);
	accomodation.setVisible (false);
	food.setVisible (false);
	entertainment.setVisible (false);
	laundry.setVisible (false);

	//Textfields
	tuitionTF.setVisible (false);
	booksTF.setVisible (false);
	accomodationTF.setVisible (false);
	foodTF.setVisible (false);
	entertainmentTF.setVisible (false);
	laundryTF.setVisible (false);

	//Aesthetics
	moneySign1.setVisible (false);
	moneySign2.setVisible (false);
	moneySign3.setVisible (false);
	moneySign4.setVisible (false);
	moneySign5.setVisible (false);
	moneySign6.setVisible (false);


	/////COSTS INPUT SCREEN 2/////
	////Sets the location and size of labels/buttons/textfields
	//Regular contents
	text7.setBounds (79, 113, 311, 61);
	text8.setBounds (79, 186, 311, 61);
	lock1.setBounds (0, 505, 400, 37);
	finishButton.setBounds (60, 550, 197, 38);
	clearButton2.setBounds (280, 550, 111, 38);

	//Prompts for inputs
	transportation1.setBounds (20, 255, 360, 20);
	transportation2.setBounds (20, 302, 360, 20);
	grooming.setBounds (20, 349, 360, 20);
	clothing.setBounds (20, 396, 360, 20);
	other.setBounds (20, 443, 360, 20);
	summerSchoolCost.setBounds (20, 490, 360, 20);

	//Textfields for inputs
	transportation1TF.setBounds (30, 280, 300, 20);
	transportation2TF.setBounds (30, 327, 300, 20);
	groomingTF.setBounds (30, 374, 300, 20);
	clothingTF.setBounds (30, 421, 300, 20);
	otherTF.setBounds (30, 468, 300, 20);
	summerSchoolCostTF.setBounds (30, 515, 300, 20);


	//Sets the font for the Labels with text
	transportation1.setFont (costs);
	transportation2.setFont (costs);
	grooming.setFont (costs);
	clothing.setFont (costs);
	other.setFont (costs);
	summerSchoolCost.setFont (costs);

	//Sets the text of the prompts for costs
	transportation1.setText ("Transportation Fee (every-day/daily):");
	transportation2.setText ("Transportation Fee (per family visit [TOTAL:2]):");
	grooming.setText ("Grooming Fee (per month):");
	clothing.setText ("Clothing Fee (per month):");
	other.setText ("Additional Fees (per week):");
	summerSchoolCost.setText ("Summer School Fee (per year):");

	//Adds the action listeners to buttons
	finishButton.addActionListener (new Finish ());
	clearButton2.addActionListener (new Clear2 ());

	//Removes the border surrounding the buttons
	finishButton.setBorder (null);
	clearButton2.setBorder (null);

	////Adds the contents to the frame
	//Regular contents
	mainFrame.getContentPane ().add (text7);
	mainFrame.getContentPane ().add (text8);
	mainFrame.getContentPane ().add (lock1);
	mainFrame.getContentPane ().add (finishButton);
	mainFrame.getContentPane ().add (clearButton2);

	//Prompts
	mainFrame.getContentPane ().add (transportation1);
	mainFrame.getContentPane ().add (transportation2);
	mainFrame.getContentPane ().add (grooming);
	mainFrame.getContentPane ().add (clothing);
	mainFrame.getContentPane ().add (other);
	mainFrame.getContentPane ().add (summerSchoolCost);

	//Textfields
	mainFrame.getContentPane ().add (transportation1TF);
	mainFrame.getContentPane ().add (transportation2TF);
	mainFrame.getContentPane ().add (groomingTF);
	mainFrame.getContentPane ().add (clothingTF);
	mainFrame.getContentPane ().add (otherTF);
	mainFrame.getContentPane ().add (summerSchoolCostTF);

	//Sets the contents of the screen invisible until called upon
	//Regular contents
	text7.setVisible (false);
	text8.setVisible (false);
	lock1.setVisible (false);
	finishButton.setVisible (false);
	clearButton2.setVisible (false);

	//Prompts
	transportation1.setVisible (false);
	transportation2.setVisible (false);
	grooming.setVisible (false);
	clothing.setVisible (false);
	other.setVisible (false);
	summerSchoolCost.setVisible (false);

	//Textfields
	transportation1TF.setVisible (false);
	transportation2TF.setVisible (false);
	groomingTF.setVisible (false);
	clothingTF.setVisible (false);
	otherTF.setVisible (false);
	summerSchoolCostTF.setVisible (false);


	/////MAIN OUTPUTSCREEN/////
	////Sets the location and size of labels/buttons
	//Regular contents
	text9.setBounds (79, 113, 311, 61);
	text10.setBounds (79, 186, 311, 61);

	//Button Prompts that lead to different outputs
	privateInfoButton.setBounds (15, 270, 163, 99);
	weeklyExpenditureButton.setBounds (220, 270, 163, 99);
	monthlyExpenditureButton.setBounds (15, 400, 163, 99);
	yearlyExpenditureButton.setBounds (220, 400, 163, 99);
	saveMoneyButton.setBounds (100, 550, 197, 38);

	//Removes the border surrounding the buttons
	privateInfoButton.setBorder (null);
	weeklyExpenditureButton.setBorder (null);
	monthlyExpenditureButton.setBorder (null);
	yearlyExpenditureButton.setBorder (null);
	saveMoneyButton.setBorder (null);

	//Adds the action listeners to buttons
	privateInfoButton.addActionListener (new PrivateInfo ());
	saveMoneyButton.addActionListener (new SaveMoney ());
	weeklyExpenditureButton.addActionListener (new WeeklyExpenditure ());
	monthlyExpenditureButton.addActionListener (new MonthlyExpenditure ());
	yearlyExpenditureButton.addActionListener (new YearlyExpenditure ());

	////Adds the contents to the frame
	//Regular contents
	mainFrame.getContentPane ().add (text9);
	mainFrame.getContentPane ().add (text10);

	//Buttons with prompts
	mainFrame.getContentPane ().add (privateInfoButton);
	mainFrame.getContentPane ().add (weeklyExpenditureButton);
	mainFrame.getContentPane ().add (monthlyExpenditureButton);
	mainFrame.getContentPane ().add (yearlyExpenditureButton);
	mainFrame.getContentPane ().add (saveMoneyButton);

	//Sets the contents of the screen invisible until called upon
	//Regular contents
	text9.setVisible (false);
	text10.setVisible (false);

	//Buttons with prompts
	privateInfoButton.setVisible (false);
	weeklyExpenditureButton.setVisible (false);
	monthlyExpenditureButton.setVisible (false);
	yearlyExpenditureButton.setVisible (false);
	saveMoneyButton.setVisible (false);

	/////SAVE MONEY SCREEN/////
	//Sets the location and size of labels/buttons
	tips.setBounds (20, 143, 357, 357);
	backButton.setBounds (100, 550, 197, 38);

	//Removes the border surrounding the buttons
	backButton.setBorder (null);

	//Adds the action listeners to buttons
	backButton.addActionListener (new Back ());

	//Adds the contents to the frame
	mainFrame.getContentPane ().add (tips);
	mainFrame.getContentPane ().add (backButton);

	//Sets the contents of the screen invisible until called upon
	tips.setVisible (false);
	backButton.setVisible (false);


	/////PRIVATE INFO SCREEN/////
	////Sets the location and size of labels
	//Title
	userInfo.setBounds (20, 143, 357, 45);

	//Data
	nameO.setBounds (10, 220, 400, 30);
	ageO.setBounds (10, 280, 400, 30);
	genderO.setBounds (10, 340, 400, 30);
	residencyO.setBounds (10, 400, 400, 30);
	universityO.setBounds (10, 460, 400, 30);

	//Sets the font for the Labels with text
	nameO.setFont (output);
	ageO.setFont (output);
	genderO.setFont (output);
	residencyO.setFont (output);
	universityO.setFont (output);

	//Sets the colour for the Labels with text
	nameO.setForeground (blue);
	ageO.setForeground (blue);
	genderO.setForeground (blue);
	residencyO.setForeground (blue);
	universityO.setForeground (blue);

	////Adds the contents to the frame
	//Title
	mainFrame.getContentPane ().add (userInfo);

	//Data
	mainFrame.getContentPane ().add (nameO);
	mainFrame.getContentPane ().add (ageO);
	mainFrame.getContentPane ().add (genderO);
	mainFrame.getContentPane ().add (residencyO);
	mainFrame.getContentPane ().add (universityO);

	//Sets the contents of the screen invisible until called upon
	//Title
	userInfo.setVisible (false);

	//Data
	nameO.setVisible (false);
	ageO.setVisible (false);
	genderO.setVisible (false);
	residencyO.setVisible (false);
	universityO.setVisible (false);

	/////WEEKLY EXPENDITURE SCREEN/////
	////Sets the location and size of labels
	//Title
	weeklyTitle.setBounds (20, 143, 357, 45);

	//Cost Data
	weeklyEO.setBounds (10, 210, 400, 20);
	tuitionWO.setBounds (10, 235, 400, 20);
	booksWO.setBounds (10, 260, 400, 20);
	accomodationWO.setBounds (10, 285, 400, 20);
	foodWO.setBounds (10, 310, 400, 20);
	entertainmentWO.setBounds (10, 335, 400, 20);
	laundryWO.setBounds (10, 360, 400, 20);
	transportation1WO.setBounds (10, 385, 400, 20);
	transportation2WO.setBounds (10, 410, 400, 20);
	groomingWO.setBounds (10, 435, 400, 20);
	clothingWO.setBounds (10, 460, 400, 20);
	otherWO.setBounds (10, 485, 400, 20);
	summerSchoolCostWO.setBounds (10, 510, 400, 20);

	//Sets the font for the Labels with text
	weeklyEO.setFont (costs);
	tuitionWO.setFont (costs);
	booksWO.setFont (costs);
	accomodationWO.setFont (costs);
	foodWO.setFont (costs);
	entertainmentWO.setFont (costs);
	laundryWO.setFont (costs);
	transportation1WO.setFont (costs);
	transportation2WO.setFont (costs);
	groomingWO.setFont (costs);
	clothingWO.setFont (costs);
	otherWO.setFont (costs);
	summerSchoolCostWO.setFont (costs);

	//Sets the colour for the Labels with text
	weeklyEO.setForeground (blue);
	tuitionWO.setForeground (blue);
	booksWO.setForeground (blue);
	accomodationWO.setForeground (blue);
	foodWO.setForeground (blue);
	entertainmentWO.setForeground (blue);
	laundryWO.setForeground (blue);
	transportation1WO.setForeground (blue);
	transportation2WO.setForeground (blue);
	groomingWO.setForeground (blue);
	clothingWO.setForeground (blue);
	otherWO.setForeground (blue);
	summerSchoolCostWO.setForeground (blue);

	////Adds the contents to the frame
	//Title
	mainFrame.getContentPane ().add (weeklyTitle);

	//Cost Data
	mainFrame.getContentPane ().add (weeklyEO);
	mainFrame.getContentPane ().add (tuitionWO);
	mainFrame.getContentPane ().add (booksWO);
	mainFrame.getContentPane ().add (accomodationWO);
	mainFrame.getContentPane ().add (foodWO);
	mainFrame.getContentPane ().add (entertainmentWO);
	mainFrame.getContentPane ().add (laundryWO);
	mainFrame.getContentPane ().add (transportation1WO);
	mainFrame.getContentPane ().add (transportation2WO);
	mainFrame.getContentPane ().add (groomingWO);
	mainFrame.getContentPane ().add (clothingWO);
	mainFrame.getContentPane ().add (otherWO);
	mainFrame.getContentPane ().add (summerSchoolCostWO);

	//Sets the contents of the screen invisible until called upon
	//Title
	weeklyTitle.setVisible (false);

	//Cost Data
	weeklyEO.setVisible (false);
	tuitionWO.setVisible (false);
	booksWO.setVisible (false);
	accomodationWO.setVisible (false);
	foodWO.setVisible (false);
	entertainmentWO.setVisible (false);
	laundryWO.setVisible (false);
	transportation1WO.setVisible (false);
	transportation2WO.setVisible (false);
	groomingWO.setVisible (false);
	clothingWO.setVisible (false);
	otherWO.setVisible (false);
	summerSchoolCostWO.setVisible (false);


	/////MONTHLY EXPENDITURE SCREEN/////
	////Sets the location and size of labels
	//Title
	monthlyTitle.setBounds (20, 143, 357, 45);

	//Cost Data
	monthlyEO.setBounds (10, 210, 400, 20);
	tuitionMO.setBounds (10, 235, 400, 20);
	booksMO.setBounds (10, 260, 400, 20);
	accomodationMO.setBounds (10, 285, 400, 20);
	foodMO.setBounds (10, 310, 400, 20);
	entertainmentMO.setBounds (10, 335, 400, 20);
	laundryMO.setBounds (10, 360, 400, 20);
	transportation1MO.setBounds (10, 385, 400, 20);
	transportation2MO.setBounds (10, 410, 400, 20);
	groomingMO.setBounds (10, 435, 400, 20);
	clothingMO.setBounds (10, 460, 400, 20);
	otherMO.setBounds (10, 485, 400, 20);
	summerSchoolCostMO.setBounds (10, 510, 400, 20);

	//Sets the font for the Labels with text
	monthlyEO.setFont (costs);
	tuitionMO.setFont (costs);
	booksMO.setFont (costs);
	accomodationMO.setFont (costs);
	foodMO.setFont (costs);
	entertainmentMO.setFont (costs);
	laundryMO.setFont (costs);
	transportation1MO.setFont (costs);
	transportation2MO.setFont (costs);
	groomingMO.setFont (costs);
	clothingMO.setFont (costs);
	otherMO.setFont (costs);
	summerSchoolCostMO.setFont (costs);

	//Sets the colour for the Labels with text
	monthlyEO.setForeground (blue);
	tuitionMO.setForeground (blue);
	booksMO.setForeground (blue);
	accomodationMO.setForeground (blue);
	foodMO.setForeground (blue);
	entertainmentMO.setForeground (blue);
	laundryMO.setForeground (blue);
	transportation1MO.setForeground (blue);
	transportation2MO.setForeground (blue);
	groomingMO.setForeground (blue);
	clothingMO.setForeground (blue);
	otherMO.setForeground (blue);
	summerSchoolCostMO.setForeground (blue);

	////Adds the contents to the frame
	//Title
	mainFrame.getContentPane ().add (monthlyTitle);

	//Cost Data
	mainFrame.getContentPane ().add (monthlyEO);
	mainFrame.getContentPane ().add (tuitionMO);
	mainFrame.getContentPane ().add (booksMO);
	mainFrame.getContentPane ().add (accomodationMO);
	mainFrame.getContentPane ().add (foodMO);
	mainFrame.getContentPane ().add (entertainmentMO);
	mainFrame.getContentPane ().add (laundryMO);
	mainFrame.getContentPane ().add (transportation1MO);
	mainFrame.getContentPane ().add (transportation2MO);
	mainFrame.getContentPane ().add (groomingMO);
	mainFrame.getContentPane ().add (clothingMO);
	mainFrame.getContentPane ().add (otherMO);
	mainFrame.getContentPane ().add (summerSchoolCostMO);

	//Sets the contents of the screen invisible until called upon
	//Title
	monthlyTitle.setVisible (false);

	//Cost Data
	monthlyEO.setVisible (false);
	tuitionMO.setVisible (false);
	booksMO.setVisible (false);
	accomodationMO.setVisible (false);
	foodMO.setVisible (false);
	entertainmentMO.setVisible (false);
	laundryMO.setVisible (false);
	transportation1MO.setVisible (false);
	transportation2MO.setVisible (false);
	groomingMO.setVisible (false);
	clothingMO.setVisible (false);
	otherMO.setVisible (false);
	summerSchoolCostMO.setVisible (false);

	/////YEARLY EXPENDITURE SCREEN/////
	////Sets the location and size of labels
	//Title
	yearlyTitle.setBounds (20, 143, 357, 45);

	//Cost Data
	yearlyEO.setBounds (10, 210, 400, 20);
	tuitionYO.setBounds (10, 235, 400, 20);
	booksYO.setBounds (10, 260, 400, 20);
	accomodationYO.setBounds (10, 285, 400, 20);
	foodYO.setBounds (10, 310, 400, 20);
	entertainmentYO.setBounds (10, 335, 400, 20);
	laundryYO.setBounds (10, 360, 400, 20);
	transportation1YO.setBounds (10, 385, 400, 20);
	transportation2YO.setBounds (10, 410, 400, 20);
	groomingYO.setBounds (10, 435, 400, 20);
	clothingYO.setBounds (10, 460, 400, 20);
	otherYO.setBounds (10, 485, 400, 20);
	summerSchoolCostYO.setBounds (10, 510, 400, 20);

	//Sets the font for the Labels with text
	yearlyEO.setFont (costs);
	tuitionYO.setFont (costs);
	booksYO.setFont (costs);
	accomodationYO.setFont (costs);
	foodYO.setFont (costs);
	entertainmentYO.setFont (costs);
	laundryYO.setFont (costs);
	transportation1YO.setFont (costs);
	transportation2YO.setFont (costs);
	groomingYO.setFont (costs);
	clothingYO.setFont (costs);
	otherYO.setFont (costs);
	summerSchoolCostYO.setFont (costs);

	//Sets the colour for the Labels with text
	yearlyEO.setForeground (blue);
	tuitionYO.setForeground (blue);
	booksYO.setForeground (blue);
	accomodationYO.setForeground (blue);
	foodYO.setForeground (blue);
	entertainmentYO.setForeground (blue);
	laundryYO.setForeground (blue);
	transportation1YO.setForeground (blue);
	transportation2YO.setForeground (blue);
	groomingYO.setForeground (blue);
	clothingYO.setForeground (blue);
	otherYO.setForeground (blue);
	summerSchoolCostYO.setForeground (blue);

	////Adds the contents to the frame
	//Title
	mainFrame.getContentPane ().add (yearlyTitle);

	//Cost Data
	mainFrame.getContentPane ().add (yearlyEO);
	mainFrame.getContentPane ().add (tuitionYO);
	mainFrame.getContentPane ().add (booksYO);
	mainFrame.getContentPane ().add (accomodationYO);
	mainFrame.getContentPane ().add (foodYO);
	mainFrame.getContentPane ().add (entertainmentYO);
	mainFrame.getContentPane ().add (laundryYO);
	mainFrame.getContentPane ().add (transportation1YO);
	mainFrame.getContentPane ().add (transportation2YO);
	mainFrame.getContentPane ().add (groomingYO);
	mainFrame.getContentPane ().add (clothingYO);
	mainFrame.getContentPane ().add (otherYO);
	mainFrame.getContentPane ().add (summerSchoolCostYO);

	//Sets the contents of the screen invisible until called upon
	//Title
	yearlyTitle.setVisible (false);

	//Cost Data
	yearlyEO.setVisible (false);
	tuitionYO.setVisible (false);
	booksYO.setVisible (false);
	accomodationYO.setVisible (false);
	foodYO.setVisible (false);
	entertainmentYO.setVisible (false);
	laundryYO.setVisible (false);
	transportation1YO.setVisible (false);
	transportation2YO.setVisible (false);
	groomingYO.setVisible (false);
	clothingYO.setVisible (false);
	otherYO.setVisible (false);
	summerSchoolCostYO.setVisible (false);

	/////OTHER/////
	////Loading Screen

	//TITLE
	//Sets the location and size
	loading.setBounds (72, 190, 257, 27);
	//Adds the title to the frame
	mainFrame.getContentPane ().add (loading);
	//Sets the title invisible until called upon
	loading.setVisible (false);

	//LOADING BARS
	//Sets the colour blue
	loadingBar1.setBackground (new Color (0, 173, 238));
	//Allows for the colour to be shown by turning it opaque
	loadingBar1.setOpaque (true);
	//Sets the size and location
	loadingBar1.setBounds (55, 250, loadingBarX, 100);
	//Adds to the frame
	mainFrame.getContentPane ().add (loadingBar1);
	//Sets invisible until called upon
	loadingBar1.setVisible (false);

	//Sets the colour grey
	loadingBar2.setBackground (new Color (206, 206, 206));
	//Allows for the colour to be shown by turning it opaque
	loadingBar2.setOpaque (true);
	//Sets the size and location
	loadingBar2.setBounds (55, 250, 300, 100);
	//Adds to the frame
	mainFrame.getContentPane ().add (loadingBar2);
	//Sets invisible until called upon
	loadingBar2.setVisible (false);

	////Calculating Screen

	//TITLE
	//Sets the location and size
	calculating.setBounds (46, 190, 317, 28);
	//Adds the title to the frame
	mainFrame.getContentPane ().add (calculating);
	//Sets the title invisible until called upon
	calculating.setVisible (false);

	//CALCULATING BARS
	//Sets the colour blue
	calculatingBar1.setBackground (new Color (0, 173, 238));
	//Allows for the colour to be shown by turning it opaque
	calculatingBar1.setOpaque (true);
	//Sets the size and location
	calculatingBar1.setBounds (55, 250, calculatingBarX, 100);
	//Adds to the frame
	mainFrame.getContentPane ().add (calculatingBar1);
	//Sets invisible until called upon
	calculatingBar1.setVisible (false);

	//Sets the colour grey
	calculatingBar2.setBackground (new Color (206, 206, 206));
	//Allows for the colour to be shown by turning it opaque
	calculatingBar2.setOpaque (true);
	//Sets the size and location
	calculatingBar2.setBounds (55, 250, 300, 100);
	//Adds to the frame
	mainFrame.getContentPane ().add (calculatingBar2);
	//Sets invisible until called upon
	calculatingBar2.setVisible (false);


	////BACKGROUND
	//Sets background colour
	background.setBackground (Color.white);
	//Allows for the colour to be shown by turning it opaque
	background.setOpaque (true);
	//Sets the size and location
	background.setBounds (0, 0, 400, 600);
	//Adds to the frame
	mainFrame.getContentPane ().add (background);


	//SETS THE MAIN FRAME VISIBLE
	mainFrame.setVisible (true);



	//Creates a while loop that executes along with the frame
	while (true)
	{
	    //Checks for the loading transition
	    if (loadScreen == 1)
	    {
		//Creates a while loops that allows the size of the label to increase to simulate a bar loading
		while (AndrewDongExpenditures.loadingBarX != 300)
		{
		    //increment of the size
		    AndrewDongExpenditures.loadingBarX = AndrewDongExpenditures.loadingBarX + 10;

		    //delay
		    for (int j = 0 ; j < 100000000 ; j++)
		    {
		    }

		    //Resizes the label
		    AndrewDongExpenditures.loadingBar1.setBounds (50, 250, AndrewDongExpenditures.loadingBarX, 100);
		}
		//Cancels the loadscreen when fully loaded
		loadScreen = 0;

		//Sets the contents invisible
		loading.setVisible (false);
		loadingBar1.setVisible (false);
		loadingBar2.setVisible (false);

		//Sets the contents of the next screen (private information screen/prompt screen) visible
		//Regular contents
		yuiAI.setVisible (true);
		text3.setVisible (true);
		text4.setVisible (true);
		yes.setVisible (true);
		no.setVisible (true);
		continueButton.setVisible (true);

		//Prompts
		name.setVisible (true);
		age.setVisible (true);
		gender.setVisible (true);
		residency.setVisible (true);
		university.setVisible (true);
		summerSchool.setVisible (true);

		//Textfields
		nameTF.setVisible (true);
		ageTF.setVisible (true);
		genderTF.setVisible (true);
		residencyTF.setVisible (true);
		universityTF.setVisible (true);
	    }

	    //Checks for the calculating transition
	    if (calculateScreen == 1)
	    {
		//Creates a while loops that allows the size of the label to increase to simulate a bar loading
		while (AndrewDongExpenditures.calculatingBarX != 300)
		{
		    //increment of the size
		    AndrewDongExpenditures.calculatingBarX = AndrewDongExpenditures.calculatingBarX + 10;

		    //delay
		    for (int j = 0 ; j < 100000000 ; j++)
		    {
		    }

		    //Resizes the label
		    AndrewDongExpenditures.calculatingBar1.setBounds (50, 250, AndrewDongExpenditures.calculatingBarX, 100);
		}
		//Cancels the calculatescreen when fully calculated
		calculateScreen = 0;

		//Sets the contents invisible
		calculating.setVisible (false);
		calculatingBar1.setVisible (false);
		calculatingBar2.setVisible (false);

		//calls upon a method that calculates the expenditures after all data is collected
		calculateExpenditures ();

		//Sets the contents of the next screen (main output screen) visible
		//Regular contents
		yuiAI.setVisible (true);
		text9.setVisible (true);
		text10.setVisible (true);

		//Button prompts
		privateInfoButton.setVisible (true);
		weeklyExpenditureButton.setVisible (true);
		monthlyExpenditureButton.setVisible (true);
		yearlyExpenditureButton.setVisible (true);
		saveMoneyButton.setVisible (true);
	    }
	}
    }


    //Creates a method for the calculations when all data is gathered
    public static void calculateExpenditures ()
    {
	//Creates the sum of the expenditures by adding each of the individual parts
	weeklyE = (double) Math.round ((tuitionW + booksW + accomodationW + foodW + entertainmentW + clothingW + laundryW + transportation1W + transportation2W + groomingW + otherW + summerSchoolCostW) * 100.0) / 100.0;
	monthlyE = (double) Math.round ((tuitionM + booksM + accomodationM + foodM + entertainmentM + clothingM + laundryM + transportation1M + transportation2M + groomingM + otherM + summerSchoolCostM) * 100.0) / 100.0;
	yearlyE = (double) Math.round ((tuitionY + booksY + accomodationY + foodY + entertainmentY + clothingY + laundryY + transportation1Y + transportation2Y + groomingY + otherY + summerSchoolCostY) * 100.0) / 100.0;

	//Sets the text of the output labels
	weeklyEO.setText ("Weekly Expenditure Total: $" + weeklyE);
	monthlyEO.setText ("Monthly Expenditure Total: $" + monthlyE);
	yearlyEO.setText ("Yearly Expenditure Total: $" + yearlyE);
    }
}

/////ACTION LISTENERS OF BUTTONS/////

//Sets the next screen
class Commence implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	//Sets the contents of the beginning screen invisible
	AndrewDongExpenditures.yuiAI.setVisible (false);
	AndrewDongExpenditures.startAesthetic.setVisible (false);
	AndrewDongExpenditures.startButton.setVisible (false);
	AndrewDongExpenditures.text1.setVisible (false);
	AndrewDongExpenditures.text2.setVisible (false);

	//Calls upon the loading screen transition
	AndrewDongExpenditures.loading.setVisible (true);
	AndrewDongExpenditures.loadingBar1.setVisible (true);
	AndrewDongExpenditures.loadingBar2.setVisible (true);
	AndrewDongExpenditures.loadScreen = 1;
    }
}

//Recieves the user's response
class YesAction implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	//Sets the value of an integer regarding summer school
	AndrewDongExpenditures.summerSchoolResponse = 1;
    }
}

//Recieves the user's response
class NoAction implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	//Sets the value of an integer regarding summer school
	AndrewDongExpenditures.summerSchoolResponse = 2;
    }
}

//Sets the next screen
class Continue implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	//Recieves values for the strings through the textfields
	AndrewDongExpenditures.nameS = AndrewDongExpenditures.nameTF.getText ();
	AndrewDongExpenditures.ageS = AndrewDongExpenditures.ageTF.getText ();
	AndrewDongExpenditures.genderS = AndrewDongExpenditures.genderTF.getText ();
	AndrewDongExpenditures.residencyS = AndrewDongExpenditures.residencyTF.getText ();
	AndrewDongExpenditures.universityS = AndrewDongExpenditures.universityTF.getText ();

	//Sets the text of the output labels regarding personal information
	AndrewDongExpenditures.nameO.setText ("Name: " + AndrewDongExpenditures.nameS);
	AndrewDongExpenditures.ageO.setText ("Age: " + AndrewDongExpenditures.ageS);
	AndrewDongExpenditures.genderO.setText ("Gender: " + AndrewDongExpenditures.genderS);
	AndrewDongExpenditures.residencyO.setText ("Residency: " + AndrewDongExpenditures.residencyS);
	AndrewDongExpenditures.universityO.setText ("University: " + AndrewDongExpenditures.universityS);

	//Checks if the textfields have been filled
	if (AndrewDongExpenditures.nameS.length () < 1 || AndrewDongExpenditures.ageS.length () < 1 || AndrewDongExpenditures.genderS.length () < 1 || AndrewDongExpenditures.residencyS.length () < 1 || AndrewDongExpenditures.universityS.length () < 1 || AndrewDongExpenditures.summerSchoolResponse == 0)
	{
	    //Responds with an error for the user to correct
	    JOptionPane.showMessageDialog (null, "Please fully fill out the form! - YUI");
	}
	else
	{
	    ////sets the contents of the previous screen invisible
	    //regular contents
	    AndrewDongExpenditures.text3.setVisible (false);
	    AndrewDongExpenditures.text4.setVisible (false);
	    AndrewDongExpenditures.yes.setVisible (false);
	    AndrewDongExpenditures.no.setVisible (false);
	    AndrewDongExpenditures.continueButton.setVisible (false);

	    //prompts
	    AndrewDongExpenditures.name.setVisible (false);
	    AndrewDongExpenditures.age.setVisible (false);
	    AndrewDongExpenditures.gender.setVisible (false);
	    AndrewDongExpenditures.residency.setVisible (false);
	    AndrewDongExpenditures.university.setVisible (false);
	    AndrewDongExpenditures.summerSchool.setVisible (false);

	    //textfields
	    AndrewDongExpenditures.nameTF.setVisible (false);
	    AndrewDongExpenditures.ageTF.setVisible (false);
	    AndrewDongExpenditures.genderTF.setVisible (false);
	    AndrewDongExpenditures.residencyTF.setVisible (false);
	    AndrewDongExpenditures.universityTF.setVisible (false);

	    ////Sets the contents of the next frame visible
	    //regular contents
	    AndrewDongExpenditures.text5.setVisible (true);
	    AndrewDongExpenditures.text6.setVisible (true);
	    AndrewDongExpenditures.nextButton.setVisible (true);
	    AndrewDongExpenditures.clearButton1.setVisible (true);

	    //cost prompts
	    AndrewDongExpenditures.tuition.setVisible (true);
	    AndrewDongExpenditures.books.setVisible (true);
	    AndrewDongExpenditures.accomodation.setVisible (true);
	    AndrewDongExpenditures.food.setVisible (true);
	    AndrewDongExpenditures.entertainment.setVisible (true);
	    AndrewDongExpenditures.laundry.setVisible (true);

	    //textfields
	    AndrewDongExpenditures.tuitionTF.setVisible (true);
	    AndrewDongExpenditures.booksTF.setVisible (true);
	    AndrewDongExpenditures.accomodationTF.setVisible (true);
	    AndrewDongExpenditures.foodTF.setVisible (true);
	    AndrewDongExpenditures.entertainmentTF.setVisible (true);
	    AndrewDongExpenditures.laundryTF.setVisible (true);

	    //aesthetics
	    AndrewDongExpenditures.moneySign1.setVisible (true);
	    AndrewDongExpenditures.moneySign2.setVisible (true);
	    AndrewDongExpenditures.moneySign3.setVisible (true);
	    AndrewDongExpenditures.moneySign4.setVisible (true);
	    AndrewDongExpenditures.moneySign5.setVisible (true);
	    AndrewDongExpenditures.moneySign6.setVisible (true);
	}
    }
}

//Sets the next screen
class Next implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	//Recieves values for the strings through the textfields
	AndrewDongExpenditures.tuitionS = AndrewDongExpenditures.tuitionTF.getText ();
	AndrewDongExpenditures.booksS = AndrewDongExpenditures.booksTF.getText ();
	AndrewDongExpenditures.accomodationS = AndrewDongExpenditures.accomodationTF.getText ();
	AndrewDongExpenditures.foodS = AndrewDongExpenditures.foodTF.getText ();
	AndrewDongExpenditures.entertainmentS = AndrewDongExpenditures.entertainmentTF.getText ();
	AndrewDongExpenditures.laundryS = AndrewDongExpenditures.laundryTF.getText ();

	//Checks if the textfields have been filled
	if (AndrewDongExpenditures.tuitionS.length () < 1 || AndrewDongExpenditures.booksS.length () < 1 || AndrewDongExpenditures.accomodationS.length () < 1 || AndrewDongExpenditures.foodS.length () < 1 || AndrewDongExpenditures.entertainmentS.length () < 1 || AndrewDongExpenditures.laundryS.length () < 1)
	{
	    //Responds with an error for the user to correct
	    JOptionPane.showMessageDialog (null, "Please fully fill out the costs! \n We need it for our calculations! - YUI");
	}
	else
	{
	    //Attempts to parse all values from the strings to doubles, catches by send the user an error to correct.
	    try
	    {
		//Parses the string to recieve costs of yearly, monthly and weekly.
		//Rounds values to hundredths
		AndrewDongExpenditures.tuitionY = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.tuitionS)) * 100.0) / 100.0;
		AndrewDongExpenditures.tuitionM = (double) Math.round ((AndrewDongExpenditures.tuitionY / 12) * 100.0) / 100.0;
		AndrewDongExpenditures.tuitionW = (double) Math.round ((AndrewDongExpenditures.tuitionY / 52) * 100.0) / 100.0;

		//Sets the error to 0
		AndrewDongExpenditures.tuitionE = 0;

		//Sets the text of the output labels regarding tuition
		AndrewDongExpenditures.tuitionYO.setText ("Tuition Expenses: $" + AndrewDongExpenditures.tuitionY);
		AndrewDongExpenditures.tuitionMO.setText ("Tuition Expenses: $" + AndrewDongExpenditures.tuitionM);
		AndrewDongExpenditures.tuitionWO.setText ("Tuition Expenses: $" + AndrewDongExpenditures.tuitionW);
	    }
	    catch (Exception e)
	    {
		//Error message for the user to correct
		JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the tuition text field! - YUI");

		//Sets the error to 1
		AndrewDongExpenditures.tuitionE = 1;
	    }

	    try
	    {
		//Parses the string to recieve costs of yearly, monthly and weekly.
		//Rounds values to hundredths
		AndrewDongExpenditures.booksM = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.booksS)) * 100) / 100;
		AndrewDongExpenditures.booksY = (double) Math.round ((AndrewDongExpenditures.booksM * 12) * 100.0) / 100.0;
		AndrewDongExpenditures.booksW = (double) Math.round ((AndrewDongExpenditures.booksY / 52) * 100.0) / 100.0;

		//Sets the error to 0
		AndrewDongExpenditures.booksE = 0;

		//Sets the text of the output labels regarding books and stationary
		AndrewDongExpenditures.booksYO.setText ("Books/Stationary Expenses: $" + AndrewDongExpenditures.booksY);
		AndrewDongExpenditures.booksMO.setText ("Books/Stationary Expenses: $" + AndrewDongExpenditures.booksM);
		AndrewDongExpenditures.booksWO.setText ("Books/Stationary Expenses: $" + AndrewDongExpenditures.booksW);
	    }
	    catch (Exception e)
	    {
		//Error message for the user to correct
		JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the books/stationary text field! - YUI");

		//Sets the error to 1
		AndrewDongExpenditures.booksE = 1;
	    }

	    try
	    {
		//Parses the string to recieve costs of yearly, monthly and weekly.
		//Rounds values to hundredths
		AndrewDongExpenditures.accomodationM = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.accomodationS)) * 100.0) / 100.0;
		AndrewDongExpenditures.accomodationY = (double) Math.round ((AndrewDongExpenditures.accomodationM * 12) * 100.0) / 100.0;
		AndrewDongExpenditures.accomodationW = (double) Math.round ((AndrewDongExpenditures.accomodationY / 52) * 100.0) / 100.0;

		//Sets the error to 0
		AndrewDongExpenditures.accomodationE = 0;

		//Sets the text of the output labels regarding accomodations/housing
		AndrewDongExpenditures.accomodationYO.setText ("Accomodation/Housing Expenses: $" + AndrewDongExpenditures.accomodationY);
		AndrewDongExpenditures.accomodationMO.setText ("Accomodation/Housing Expenses: $" + AndrewDongExpenditures.accomodationM);
		AndrewDongExpenditures.accomodationWO.setText ("Accomodation/Housing Expenses: $" + AndrewDongExpenditures.accomodationW);
	    }
	    catch (Exception e)
	    {
		//Error message for the user to correct
		JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the accomodation/housing text field! - YUI");

		//Sets the error to 1
		AndrewDongExpenditures.accomodationE = 1;
	    }

	    try
	    {
		//Parses the string to recieve costs of yearly, monthly and weekly.
		//Rounds values to hundredths
		AndrewDongExpenditures.foodW = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.foodS)) * 100.0) / 100.0;
		AndrewDongExpenditures.foodY = (double) Math.round ((AndrewDongExpenditures.foodW * 52) * 100.0) / 100.0;
		AndrewDongExpenditures.foodM = (double) Math.round ((AndrewDongExpenditures.foodY / 12) * 100.0) / 100.0;

		//Sets the error to 0
		AndrewDongExpenditures.foodE = 0;

		//Sets the text of the output labels regarding food
		AndrewDongExpenditures.foodYO.setText ("Food Expenses: $" + AndrewDongExpenditures.foodY);
		AndrewDongExpenditures.foodMO.setText ("Food Expenses: $" + AndrewDongExpenditures.foodM);
		AndrewDongExpenditures.foodWO.setText ("Food Expenses: $" + AndrewDongExpenditures.foodW);
	    }
	    catch (Exception e)
	    {
		//Error message for the user to correct
		JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the food text field! - YUI");

		//Sets the error to 1
		AndrewDongExpenditures.foodE = 1;
	    }

	    try
	    {
		//Parses the string to recieve costs of yearly, monthly and weekly.
		//Rounds values to hundredths
		AndrewDongExpenditures.entertainmentW = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.entertainmentS)) * 100.0) / 100.0;
		AndrewDongExpenditures.entertainmentY = (double) Math.round ((AndrewDongExpenditures.entertainmentW * 52) * 100.0) / 100.0;
		AndrewDongExpenditures.entertainmentM = (double) Math.round ((AndrewDongExpenditures.entertainmentY / 12) * 100.0) / 100.0;

		//Sets the error to 0
		AndrewDongExpenditures.entertainmentE = 0;

		//Sets the text of the output labels regarding entertainment
		AndrewDongExpenditures.entertainmentYO.setText ("Entertainment Expenses: $" + AndrewDongExpenditures.entertainmentY);
		AndrewDongExpenditures.entertainmentMO.setText ("Entertainment Expenses: $" + AndrewDongExpenditures.entertainmentM);
		AndrewDongExpenditures.entertainmentWO.setText ("Entertainment Expenses: $" + AndrewDongExpenditures.entertainmentW);
	    }
	    catch (Exception e)
	    {
		//Error message for the user to correct
		JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the entertainment text field! - YUI");

		//Sets the error to 1
		AndrewDongExpenditures.entertainmentE = 1;
	    }

	    try
	    {
		//Parses the string to recieve costs of yearly, monthly and weekly.
		//Rounds values to hundredths
		AndrewDongExpenditures.laundryW = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.laundryS)) * 100.0) / 100.0;
		AndrewDongExpenditures.laundryY = (double) Math.round ((AndrewDongExpenditures.laundryW * 52) * 100.0) / 100.0;
		AndrewDongExpenditures.laundryM = (double) Math.round ((AndrewDongExpenditures.laundryY / 12) * 100.0) / 100.0;

		//Sets the error to 0
		AndrewDongExpenditures.laundryE = 0;

		//Sets the text of the output labels regarding laundry
		AndrewDongExpenditures.laundryYO.setText ("Laundry Expenses: $" + AndrewDongExpenditures.laundryY);
		AndrewDongExpenditures.laundryMO.setText ("Laundry Expenses: $" + AndrewDongExpenditures.laundryM);
		AndrewDongExpenditures.laundryWO.setText ("Laundry Expenses: $" + AndrewDongExpenditures.laundryW);
	    }
	    catch (Exception e)
	    {
		//Error message for the user to correct
		JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the laundry text field! - YUI");

		//Sets the error to 1
		AndrewDongExpenditures.laundryE = 1;
	    }

	    //Checks if there are no errors regarding parsing
	    if (AndrewDongExpenditures.tuitionE == 0 && AndrewDongExpenditures.booksE == 0 && AndrewDongExpenditures.accomodationE == 0 && AndrewDongExpenditures.foodE == 0 && AndrewDongExpenditures.entertainmentE == 0 && AndrewDongExpenditures.laundryE == 0)
	    {
		////sets the contents of the previous screen invisible
		//regular contents
		AndrewDongExpenditures.text5.setVisible (false);
		AndrewDongExpenditures.text6.setVisible (false);
		AndrewDongExpenditures.nextButton.setVisible (false);
		AndrewDongExpenditures.clearButton1.setVisible (false);

		//cost prompts
		AndrewDongExpenditures.tuition.setVisible (false);
		AndrewDongExpenditures.books.setVisible (false);
		AndrewDongExpenditures.accomodation.setVisible (false);
		AndrewDongExpenditures.food.setVisible (false);
		AndrewDongExpenditures.entertainment.setVisible (false);
		AndrewDongExpenditures.laundry.setVisible (false);

		//textfields
		AndrewDongExpenditures.tuitionTF.setVisible (false);
		AndrewDongExpenditures.booksTF.setVisible (false);
		AndrewDongExpenditures.accomodationTF.setVisible (false);
		AndrewDongExpenditures.foodTF.setVisible (false);
		AndrewDongExpenditures.entertainmentTF.setVisible (false);
		AndrewDongExpenditures.laundryTF.setVisible (false);

		////Sets the contents of the next frame visible
		//regular contents
		AndrewDongExpenditures.text7.setVisible (true);
		AndrewDongExpenditures.text8.setVisible (true);
		AndrewDongExpenditures.clearButton2.setVisible (true);
		AndrewDongExpenditures.finishButton.setVisible (true);

		//cost prompts
		AndrewDongExpenditures.transportation1.setVisible (true);
		AndrewDongExpenditures.transportation2.setVisible (true);
		AndrewDongExpenditures.grooming.setVisible (true);
		AndrewDongExpenditures.clothing.setVisible (true);
		AndrewDongExpenditures.other.setVisible (true);

		//textfields
		AndrewDongExpenditures.transportation1TF.setVisible (true);
		AndrewDongExpenditures.transportation2TF.setVisible (true);
		AndrewDongExpenditures.groomingTF.setVisible (true);
		AndrewDongExpenditures.clothingTF.setVisible (true);
		AndrewDongExpenditures.otherTF.setVisible (true);

		//Checks for the user's response of summer school
		if (AndrewDongExpenditures.summerSchoolResponse == 1)
		{
		    //Sets the prompt+input visible
		    AndrewDongExpenditures.summerSchoolCostTF.setVisible (true);
		    AndrewDongExpenditures.summerSchoolCost.setVisible (true);

		}
		else if (AndrewDongExpenditures.summerSchoolResponse == 2)
		{
		    //sets the lock visible
		    AndrewDongExpenditures.lock1.setVisible (true);
		    AndrewDongExpenditures.moneySign6.setVisible (false);
		}
	    }
	}
    }
}

//Sets the next screen
class Finish implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	//Recieves values for the strings through the textfields
	AndrewDongExpenditures.transportation1S = AndrewDongExpenditures.transportation1TF.getText ();
	AndrewDongExpenditures.transportation2S = AndrewDongExpenditures.transportation2TF.getText ();
	AndrewDongExpenditures.groomingS = AndrewDongExpenditures.groomingTF.getText ();
	AndrewDongExpenditures.clothingS = AndrewDongExpenditures.clothingTF.getText ();
	AndrewDongExpenditures.otherS = AndrewDongExpenditures.otherTF.getText ();
	AndrewDongExpenditures.summerSchoolCostS = AndrewDongExpenditures.summerSchoolCostTF.getText ();

	//Checks the user's response regarding summer school
	if (AndrewDongExpenditures.summerSchoolResponse == 1)
	{
	    //Checks if the textfields have been filled
	    if (AndrewDongExpenditures.transportation1S.length () < 1 || AndrewDongExpenditures.transportation2S.length () < 1 || AndrewDongExpenditures.groomingS.length () < 1 || AndrewDongExpenditures.clothingS.length () < 1 || AndrewDongExpenditures.otherS.length () < 1 || AndrewDongExpenditures.summerSchoolCostS.length () < 1)
	    {
		//Responds with an error for the user to correct
		JOptionPane.showMessageDialog (null, "Please fully fill out the costs! \n We need it for our calculations! - YUI");
	    }
	    else
	    {
		//Attempts to parse all values from the strings to doubles, catches by send the user an error to correct.
		try
		{
		    //Parses the string to recieve costs of yearly, monthly and weekly.
		    //Rounds values to hundredths
		    AndrewDongExpenditures.transportation1D = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.transportation1S)) * 100.0) / 100.0;
		    AndrewDongExpenditures.transportation1Y = (double) Math.round ((AndrewDongExpenditures.transportation1D * 365) * 100.0) / 100.0;
		    AndrewDongExpenditures.transportation1M = (double) Math.round ((AndrewDongExpenditures.transportation1Y / 12) * 100.0) / 100.0;
		    AndrewDongExpenditures.transportation1W = (double) Math.round ((AndrewDongExpenditures.transportation1D * 7) * 100.0) / 100.0;

		    //Sets the error to 0
		    AndrewDongExpenditures.transportation1E = 0;

		    //Sets the text of the output labels regarding transportation
		    AndrewDongExpenditures.transportation1YO.setText ("Every-day Transportation Expenses: $" + AndrewDongExpenditures.transportation1Y);
		    AndrewDongExpenditures.transportation1MO.setText ("Every-day Transportation Expenses: $" + AndrewDongExpenditures.transportation1M);
		    AndrewDongExpenditures.transportation1WO.setText ("Every-day Transportation Expenses: $" + AndrewDongExpenditures.transportation1W);
		}
		catch (Exception e)
		{
		    //Error message for the user to correct
		    JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the first transportation text field! - YUI");

		    //Sets the error to 1
		    AndrewDongExpenditures.transportation1E = 1;
		}

		try
		{
		    //Parses the string to recieve costs of yearly, monthly and weekly.
		    //Rounds values to hundredths
		    AndrewDongExpenditures.transportation2Y = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.transportation2S)) * 2 * 100.0) / 100.0;
		    AndrewDongExpenditures.transportation2M = (double) Math.round ((AndrewDongExpenditures.transportation2Y / 12) * 100.0) / 100.0;
		    AndrewDongExpenditures.transportation2W = (double) Math.round ((AndrewDongExpenditures.transportation2Y / 52) * 100.0) / 100.0;

		    //Sets the error to 0
		    AndrewDongExpenditures.transportation2E = 0;

		    //Sets the text of the output labels regarding transportation
		    AndrewDongExpenditures.transportation2YO.setText ("Visit Transportation Expenses: $" + AndrewDongExpenditures.transportation2Y);
		    AndrewDongExpenditures.transportation2MO.setText ("Visit Transportation Expenses: $" + AndrewDongExpenditures.transportation2M);
		    AndrewDongExpenditures.transportation2WO.setText ("Visit Transportation Expenses: $" + AndrewDongExpenditures.transportation2W);
		}
		catch (Exception e)
		{
		    //Error message for the user to correct
		    JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the second transportation text field! - YUI");

		    //Sets the error to 1
		    AndrewDongExpenditures.transportation2E = 1;
		}

		try
		{
		    //Parses the string to recieve costs of yearly, monthly and weekly.
		    //Rounds values to hundredths
		    AndrewDongExpenditures.groomingM = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.groomingS)) * 100.0) / 100.0;
		    AndrewDongExpenditures.groomingY = (double) Math.round ((AndrewDongExpenditures.groomingM * 12) * 100.0) / 100.0;
		    AndrewDongExpenditures.groomingW = (double) Math.round ((AndrewDongExpenditures.groomingY / 52) * 100.0) / 100.0;

		    //Sets the error to 0
		    AndrewDongExpenditures.groomingE = 0;

		    //Sets the text of the output labels regarding grooming
		    AndrewDongExpenditures.groomingYO.setText ("Grooming Expenses: $" + AndrewDongExpenditures.groomingY);
		    AndrewDongExpenditures.groomingMO.setText ("Grooming Expenses: $" + AndrewDongExpenditures.groomingM);
		    AndrewDongExpenditures.groomingWO.setText ("Grooming Expenses: $" + AndrewDongExpenditures.groomingW);
		}
		catch (Exception e)
		{
		    //Error message for the user to correct
		    JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the grooming text field! - YUI");

		    //Sets the error to 1
		    AndrewDongExpenditures.groomingE = 1;
		}

		try
		{
		    //Parses the string to recieve costs of yearly, monthly and weekly.
		    //Rounds values to hundredths
		    AndrewDongExpenditures.clothingM = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.clothingS)) * 100.0) / 100.0;
		    AndrewDongExpenditures.clothingY = (double) Math.round ((AndrewDongExpenditures.clothingM * 12) * 100.0) / 100.0;
		    AndrewDongExpenditures.clothingW = (double) Math.round ((AndrewDongExpenditures.clothingY / 52) * 100.0) / 100.0;

		    //Sets the error to 0
		    AndrewDongExpenditures.clothingE = 0;

		    //Sets the text of the output labels regarding clothing
		    AndrewDongExpenditures.clothingYO.setText ("Clothing Expenses: $" + AndrewDongExpenditures.clothingY);
		    AndrewDongExpenditures.clothingMO.setText ("Clothing Expenses: $" + AndrewDongExpenditures.clothingM);
		    AndrewDongExpenditures.clothingWO.setText ("Clothing Expenses: $" + AndrewDongExpenditures.clothingW);
		}
		catch (Exception e)
		{
		    //Error message for the user to correct
		    JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the clothing text field! - YUI");

		    //Sets the error to 1
		    AndrewDongExpenditures.clothingE = 1;
		}

		try
		{
		    //Parses the string to recieve costs of yearly, monthly and weekly.
		    //Rounds values to hundredths
		    AndrewDongExpenditures.otherW = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.otherS)) * 100.0) / 100.0;
		    AndrewDongExpenditures.otherY = (double) Math.round ((AndrewDongExpenditures.otherW * 52) * 100.0) / 100.0;
		    AndrewDongExpenditures.otherM = (double) Math.round ((AndrewDongExpenditures.otherY / 12) * 100.0) / 100.0;

		    //Sets the error to 0
		    AndrewDongExpenditures.otherE = 0;

		    //Sets the text of the output labels regarding other costs
		    AndrewDongExpenditures.otherYO.setText ("Other Expenses: $" + AndrewDongExpenditures.otherY);
		    AndrewDongExpenditures.otherMO.setText ("Other Expenses: $" + AndrewDongExpenditures.otherM);
		    AndrewDongExpenditures.otherWO.setText ("Other Expenses: $" + AndrewDongExpenditures.otherW);
		}
		catch (Exception e)
		{
		    //Error message for the user to correct
		    JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the additional fees text field! - YUI");

		    //Sets the error to 1
		    AndrewDongExpenditures.otherE = 1;
		}

		try
		{
		    //Parses the string to recieve costs of yearly, monthly and weekly.
		    //Rounds values to hundredths
		    AndrewDongExpenditures.summerSchoolCostY = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.summerSchoolCostS)) * 100.0) / 100.0;
		    AndrewDongExpenditures.summerSchoolCostM = (double) Math.round ((AndrewDongExpenditures.summerSchoolCostY / 12) * 100.0) / 100.0;
		    AndrewDongExpenditures.summerSchoolCostW = (double) Math.round ((AndrewDongExpenditures.summerSchoolCostY / 52) * 100.0) / 100.0;

		    //Sets the error to 0
		    AndrewDongExpenditures.summerSchoolCostE = 0;

		    //Sets the text of the output labels regarding summer school
		    AndrewDongExpenditures.summerSchoolCostYO.setText ("Summer School Expenses: $" + AndrewDongExpenditures.summerSchoolCostY);
		    AndrewDongExpenditures.summerSchoolCostMO.setText ("Summer School Expenses: $" + AndrewDongExpenditures.summerSchoolCostM);
		    AndrewDongExpenditures.summerSchoolCostWO.setText ("Summer School Expenses: $" + AndrewDongExpenditures.summerSchoolCostW);
		}
		catch (Exception e)
		{
		    //Error message for the user to correct
		    JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the summer school text field! - YUI");

		    //Sets the error to 1
		    AndrewDongExpenditures.summerSchoolCostE = 1;
		}


		//Checks if there are no errors regarding parsing
		if (AndrewDongExpenditures.transportation1E == 0 && AndrewDongExpenditures.transportation2E == 0 && AndrewDongExpenditures.groomingE == 0 && AndrewDongExpenditures.clothingE == 0 && AndrewDongExpenditures.otherE == 0 && AndrewDongExpenditures.summerSchoolCostE == 0)
		{

		    ////sets the contents of the previous screen invisible
		    //regular contents
		    AndrewDongExpenditures.yuiAI.setVisible (false);
		    AndrewDongExpenditures.text7.setVisible (false);
		    AndrewDongExpenditures.text8.setVisible (false);
		    AndrewDongExpenditures.clearButton2.setVisible (false);
		    AndrewDongExpenditures.finishButton.setVisible (false);

		    //cost prompts
		    AndrewDongExpenditures.transportation1.setVisible (false);
		    AndrewDongExpenditures.transportation2.setVisible (false);
		    AndrewDongExpenditures.grooming.setVisible (false);
		    AndrewDongExpenditures.clothing.setVisible (false);
		    AndrewDongExpenditures.other.setVisible (false);
		    AndrewDongExpenditures.summerSchoolCost.setVisible (false);

		    //textfields
		    AndrewDongExpenditures.transportation1TF.setVisible (false);
		    AndrewDongExpenditures.transportation2TF.setVisible (false);
		    AndrewDongExpenditures.groomingTF.setVisible (false);
		    AndrewDongExpenditures.clothingTF.setVisible (false);
		    AndrewDongExpenditures.otherTF.setVisible (false);
		    AndrewDongExpenditures.summerSchoolCostTF.setVisible (false);

		    //aesthetics
		    AndrewDongExpenditures.moneySign1.setVisible (false);
		    AndrewDongExpenditures.moneySign2.setVisible (false);
		    AndrewDongExpenditures.moneySign3.setVisible (false);
		    AndrewDongExpenditures.moneySign4.setVisible (false);
		    AndrewDongExpenditures.moneySign5.setVisible (false);
		    AndrewDongExpenditures.moneySign6.setVisible (false);

		    ////Calls upon the calculate screen transition
		    AndrewDongExpenditures.calculating.setVisible (true);
		    AndrewDongExpenditures.calculatingBar1.setVisible (true);
		    AndrewDongExpenditures.calculatingBar2.setVisible (true);

		    AndrewDongExpenditures.calculateScreen = 1;
		}
	    }
	}

	//Checks the user's response regarding summer school
	if (AndrewDongExpenditures.summerSchoolResponse == 2)
	{
	    //Checks if the textfields have been filled
	    if (AndrewDongExpenditures.transportation1S.length () < 1 || AndrewDongExpenditures.transportation2S.length () < 1 || AndrewDongExpenditures.groomingS.length () < 1 || AndrewDongExpenditures.clothingS.length () < 1 || AndrewDongExpenditures.otherS.length () < 1)
	    {
		//Responds with an error for the user to correct
		JOptionPane.showMessageDialog (null, "Please fully fill out the costs! \n We need it for our calculations! - YUI");
	    }
	    else
	    {
		try
		{
		    //Parses the string to recieve costs of yearly, monthly and weekly.
		    //Rounds values to hundredths
		    AndrewDongExpenditures.transportation1D = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.transportation1S)) * 100.0) / 100.0;
		    AndrewDongExpenditures.transportation1Y = (double) Math.round ((AndrewDongExpenditures.transportation1D * 365) * 100.0) / 100.0;
		    AndrewDongExpenditures.transportation1M = (double) Math.round ((AndrewDongExpenditures.transportation1Y / 12) * 100.0) / 100.0;
		    AndrewDongExpenditures.transportation1W = (double) Math.round ((AndrewDongExpenditures.transportation1D * 7) * 100.0) / 100.0;

		    //Sets the error to 0
		    AndrewDongExpenditures.transportation1E = 0;

		    //Sets the text of the output labels regarding transportation
		    AndrewDongExpenditures.transportation1YO.setText ("Every-day Transportation Expenses: $" + AndrewDongExpenditures.transportation1Y);
		    AndrewDongExpenditures.transportation1MO.setText ("Every-day Transportation Expenses: $" + AndrewDongExpenditures.transportation1M);
		    AndrewDongExpenditures.transportation1WO.setText ("Every-day Transportation Expenses: $" + AndrewDongExpenditures.transportation1W);
		}
		catch (Exception e)
		{
		    //Error message for the user to correct
		    JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the first transportation text field! - YUI");

		    //Sets the error to 1
		    AndrewDongExpenditures.transportation1E = 1;
		}

		try
		{
		    //Parses the string to recieve costs of yearly, monthly and weekly.
		    //Rounds values to hundredths
		    AndrewDongExpenditures.transportation2Y = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.transportation2S)) * 2 * 100.0) / 100.0;
		    AndrewDongExpenditures.transportation2M = (double) Math.round ((AndrewDongExpenditures.transportation2Y / 12) * 100.0) / 100.0;
		    AndrewDongExpenditures.transportation2W = (double) Math.round ((AndrewDongExpenditures.transportation2Y / 52) * 100.0) / 100.0;
		    //Sets the error to 0
		    AndrewDongExpenditures.transportation2E = 0;

		    //Sets the text of the output labels regarding transportation
		    AndrewDongExpenditures.transportation2YO.setText ("Visit Transportation Expenses: $" + AndrewDongExpenditures.transportation2Y);
		    AndrewDongExpenditures.transportation2MO.setText ("Visit Transportation Expenses: $" + AndrewDongExpenditures.transportation2M);
		    AndrewDongExpenditures.transportation2WO.setText ("Visit Transportation Expenses: $" + AndrewDongExpenditures.transportation2W);
		}
		catch (Exception e)
		{
		    //Error message for the user to correct
		    JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the second transportation text field! - YUI");
		    //Sets the error to 1
		    AndrewDongExpenditures.transportation2E = 1;
		}

		try
		{
		    //Parses the string to recieve costs of yearly, monthly and weekly.
		    //Rounds values to hundredths
		    AndrewDongExpenditures.groomingM = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.groomingS)) * 100.0) / 100.0;
		    AndrewDongExpenditures.groomingY = (double) Math.round ((AndrewDongExpenditures.groomingM * 12) * 100.0) / 100.0;
		    AndrewDongExpenditures.groomingW = (double) Math.round ((AndrewDongExpenditures.groomingY / 52) * 100.0) / 100.0;

		    //Sets the error to 0
		    AndrewDongExpenditures.groomingE = 0;

		    //Sets the text of the output labels regarding grooming
		    AndrewDongExpenditures.groomingYO.setText ("Grooming Expenses: $" + AndrewDongExpenditures.groomingY);
		    AndrewDongExpenditures.groomingMO.setText ("Grooming Expenses: $" + AndrewDongExpenditures.groomingM);
		    AndrewDongExpenditures.groomingWO.setText ("Grooming Expenses: $" + AndrewDongExpenditures.groomingW);
		}
		catch (Exception e)
		{
		    //Error message for the user to correct
		    JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the grooming text field! - YUI");

		    //Sets the error to 1
		    AndrewDongExpenditures.groomingE = 1;
		}

		try
		{
		    //Parses the string to recieve costs of yearly, monthly and weekly.
		    //Rounds values to hundredths
		    AndrewDongExpenditures.clothingM = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.clothingS)) * 100.0) / 100.0;
		    AndrewDongExpenditures.clothingY = (double) Math.round ((AndrewDongExpenditures.clothingM * 12) * 100.0) / 100.0;
		    AndrewDongExpenditures.clothingW = (double) Math.round ((AndrewDongExpenditures.clothingY / 52) * 100.0) / 100.0;

		    //Sets the error to 0
		    AndrewDongExpenditures.clothingE = 0;

		    //Sets the text of the output labels regarding clothing
		    AndrewDongExpenditures.clothingYO.setText ("Clothing Expenses: $" + AndrewDongExpenditures.clothingY);
		    AndrewDongExpenditures.clothingMO.setText ("Clothing Expenses: $" + AndrewDongExpenditures.clothingM);
		    AndrewDongExpenditures.clothingWO.setText ("Clothing Expenses: $" + AndrewDongExpenditures.clothingW);
		}
		catch (Exception e)
		{
		    //Error message for the user to correct
		    JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the clothing text field! - YUI");

		    //Sets the error to 1
		    AndrewDongExpenditures.clothingE = 1;
		}

		try
		{
		    //Parses the string to recieve costs of yearly, monthly and weekly.
		    //Rounds values to hundredths
		    AndrewDongExpenditures.otherW = (double) Math.round ((Double.parseDouble (AndrewDongExpenditures.otherS)) * 100.0) / 100.0;
		    AndrewDongExpenditures.otherY = (double) Math.round ((AndrewDongExpenditures.otherW * 52) * 100.0) / 100.0;
		    AndrewDongExpenditures.otherM = (double) Math.round ((AndrewDongExpenditures.otherY / 12) * 100.0) / 100.0;

		    //Sets the error to 0
		    AndrewDongExpenditures.otherE = 0;

		    //Sets the text of the output labels regarding other costs
		    AndrewDongExpenditures.otherYO.setText ("Other Expenses: $" + AndrewDongExpenditures.otherY);
		    AndrewDongExpenditures.otherMO.setText ("Other Expenses: $" + AndrewDongExpenditures.otherM);
		    AndrewDongExpenditures.otherWO.setText ("Other Expenses: $" + AndrewDongExpenditures.otherW);
		}
		catch (Exception e)
		{
		    //Error message for the user to correct
		    JOptionPane.showMessageDialog (null, "You have entered a symbol or letter in the additional fees text field! - YUI");

		    //Sets the error to 1
		    AndrewDongExpenditures.otherE = 1;
		}

		//Checks if there are no errors regarding parsing
		if (AndrewDongExpenditures.transportation1E == 0 && AndrewDongExpenditures.transportation2E == 0 && AndrewDongExpenditures.groomingE == 0 && AndrewDongExpenditures.clothingE == 0 && AndrewDongExpenditures.otherE == 0)
		{
		    ////sets the contents of the previous screen invisible
		    //regular contents
		    AndrewDongExpenditures.yuiAI.setVisible (false);
		    AndrewDongExpenditures.text7.setVisible (false);
		    AndrewDongExpenditures.text8.setVisible (false);
		    AndrewDongExpenditures.finishButton.setVisible (false);
		    AndrewDongExpenditures.clearButton2.setVisible (false);
		    AndrewDongExpenditures.lock1.setVisible (false);

		    //cost prompts
		    AndrewDongExpenditures.transportation1.setVisible (false);
		    AndrewDongExpenditures.transportation2.setVisible (false);
		    AndrewDongExpenditures.grooming.setVisible (false);
		    AndrewDongExpenditures.clothing.setVisible (false);
		    AndrewDongExpenditures.other.setVisible (false);

		    //textfields
		    AndrewDongExpenditures.transportation1TF.setVisible (false);
		    AndrewDongExpenditures.transportation2TF.setVisible (false);
		    AndrewDongExpenditures.groomingTF.setVisible (false);
		    AndrewDongExpenditures.clothingTF.setVisible (false);
		    AndrewDongExpenditures.otherTF.setVisible (false);

		    //aesthetics
		    AndrewDongExpenditures.moneySign1.setVisible (false);
		    AndrewDongExpenditures.moneySign2.setVisible (false);
		    AndrewDongExpenditures.moneySign3.setVisible (false);
		    AndrewDongExpenditures.moneySign4.setVisible (false);
		    AndrewDongExpenditures.moneySign5.setVisible (false);
		    AndrewDongExpenditures.moneySign6.setVisible (false);
		    AndrewDongExpenditures.calculating.setVisible (true);

		    //cals upon the calculating screen transition
		    AndrewDongExpenditures.calculatingBar1.setVisible (true);
		    AndrewDongExpenditures.calculatingBar2.setVisible (true);

		    AndrewDongExpenditures.calculateScreen = 1;
		}
	    }
	}
    }
}

//Sets the next screen
class SaveMoney implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	////sets the contents of the previous screen invisible
	//regular contents
	AndrewDongExpenditures.yuiAI.setVisible (false);
	AndrewDongExpenditures.text9.setVisible (false);
	AndrewDongExpenditures.text10.setVisible (false);

	//button prompts
	AndrewDongExpenditures.privateInfoButton.setVisible (false);
	AndrewDongExpenditures.weeklyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.monthlyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.yearlyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.saveMoneyButton.setVisible (false);

	////Sets the contents of the next frame visible
	AndrewDongExpenditures.backButton.setVisible (true);
	AndrewDongExpenditures.tips.setVisible (true);

    }
}

//Sets the next screen
class Back implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {

	////sets the contents of the previous screens invisible
	//regular
	AndrewDongExpenditures.backButton.setVisible (false);
	AndrewDongExpenditures.lock1.setVisible (false);

	//Save Money Screen
	AndrewDongExpenditures.tips.setVisible (false);

	//Private Info Screen
	AndrewDongExpenditures.userInfo.setVisible (false);
	AndrewDongExpenditures.nameO.setVisible (false);
	AndrewDongExpenditures.ageO.setVisible (false);
	AndrewDongExpenditures.genderO.setVisible (false);
	AndrewDongExpenditures.residencyO.setVisible (false);
	AndrewDongExpenditures.universityO.setVisible (false);

	//Weekly Expenditure Screen
	AndrewDongExpenditures.weeklyTitle.setVisible (false);
	AndrewDongExpenditures.weeklyEO.setVisible (false);
	AndrewDongExpenditures.tuitionWO.setVisible (false);
	AndrewDongExpenditures.booksWO.setVisible (false);
	AndrewDongExpenditures.accomodationWO.setVisible (false);
	AndrewDongExpenditures.foodWO.setVisible (false);
	AndrewDongExpenditures.entertainmentWO.setVisible (false);
	AndrewDongExpenditures.laundryWO.setVisible (false);
	AndrewDongExpenditures.transportation1WO.setVisible (false);
	AndrewDongExpenditures.transportation2WO.setVisible (false);
	AndrewDongExpenditures.groomingWO.setVisible (false);
	AndrewDongExpenditures.clothingWO.setVisible (false);
	AndrewDongExpenditures.otherWO.setVisible (false);
	AndrewDongExpenditures.summerSchoolCostWO.setVisible (false);

	//Monthly Expenditure Screen
	AndrewDongExpenditures.monthlyTitle.setVisible (false);
	AndrewDongExpenditures.monthlyEO.setVisible (false);
	AndrewDongExpenditures.tuitionMO.setVisible (false);
	AndrewDongExpenditures.booksMO.setVisible (false);
	AndrewDongExpenditures.accomodationMO.setVisible (false);
	AndrewDongExpenditures.foodMO.setVisible (false);
	AndrewDongExpenditures.entertainmentMO.setVisible (false);
	AndrewDongExpenditures.laundryMO.setVisible (false);
	AndrewDongExpenditures.transportation1MO.setVisible (false);
	AndrewDongExpenditures.transportation2MO.setVisible (false);
	AndrewDongExpenditures.groomingMO.setVisible (false);
	AndrewDongExpenditures.clothingMO.setVisible (false);
	AndrewDongExpenditures.otherMO.setVisible (false);
	AndrewDongExpenditures.summerSchoolCostMO.setVisible (false);

	//Yearly Expenditure Screen
	AndrewDongExpenditures.yearlyTitle.setVisible (false);
	AndrewDongExpenditures.yearlyEO.setVisible (false);
	AndrewDongExpenditures.tuitionYO.setVisible (false);
	AndrewDongExpenditures.booksYO.setVisible (false);
	AndrewDongExpenditures.accomodationYO.setVisible (false);
	AndrewDongExpenditures.foodYO.setVisible (false);
	AndrewDongExpenditures.entertainmentYO.setVisible (false);
	AndrewDongExpenditures.laundryYO.setVisible (false);
	AndrewDongExpenditures.transportation1YO.setVisible (false);
	AndrewDongExpenditures.transportation2YO.setVisible (false);
	AndrewDongExpenditures.groomingYO.setVisible (false);
	AndrewDongExpenditures.clothingYO.setVisible (false);
	AndrewDongExpenditures.otherYO.setVisible (false);
	AndrewDongExpenditures.summerSchoolCostYO.setVisible (false);

	////Sets the contents of the next frame visible
	//regular contents
	AndrewDongExpenditures.yuiAI.setVisible (true);
	AndrewDongExpenditures.text9.setVisible (true);
	AndrewDongExpenditures.text10.setVisible (true);

	//Button prompts
	AndrewDongExpenditures.privateInfoButton.setVisible (true);
	AndrewDongExpenditures.weeklyExpenditureButton.setVisible (true);
	AndrewDongExpenditures.monthlyExpenditureButton.setVisible (true);
	AndrewDongExpenditures.yearlyExpenditureButton.setVisible (true);
	AndrewDongExpenditures.saveMoneyButton.setVisible (true);
    }
}

//Sets the next screen
class PrivateInfo implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	///sets the contents of the previous screen invisible
	//regular contents
	AndrewDongExpenditures.yuiAI.setVisible (false);
	AndrewDongExpenditures.text9.setVisible (false);
	AndrewDongExpenditures.text10.setVisible (false);

	//button prompts
	AndrewDongExpenditures.privateInfoButton.setVisible (false);
	AndrewDongExpenditures.weeklyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.monthlyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.yearlyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.saveMoneyButton.setVisible (false);

	////Sets the contents of the next frame visible
	//regular contents
	AndrewDongExpenditures.backButton.setVisible (true);
	AndrewDongExpenditures.userInfo.setVisible (true);

	//data output
	AndrewDongExpenditures.nameO.setVisible (true);
	AndrewDongExpenditures.ageO.setVisible (true);
	AndrewDongExpenditures.genderO.setVisible (true);
	AndrewDongExpenditures.residencyO.setVisible (true);
	AndrewDongExpenditures.universityO.setVisible (true);
    }
}

//Sets the next screen
class WeeklyExpenditure implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	////sets the contents of the previous screen invisible
	//regular contents
	AndrewDongExpenditures.yuiAI.setVisible (false);
	AndrewDongExpenditures.text9.setVisible (false);
	AndrewDongExpenditures.text10.setVisible (false);

	//button prompts
	AndrewDongExpenditures.privateInfoButton.setVisible (false);
	AndrewDongExpenditures.weeklyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.monthlyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.yearlyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.saveMoneyButton.setVisible (false);

	////Sets the contents of the next frame visible
	//regular contents
	AndrewDongExpenditures.backButton.setVisible (true);
	AndrewDongExpenditures.weeklyTitle.setVisible (true);

	//cost data
	AndrewDongExpenditures.weeklyEO.setVisible (true);
	AndrewDongExpenditures.tuitionWO.setVisible (true);
	AndrewDongExpenditures.booksWO.setVisible (true);
	AndrewDongExpenditures.accomodationWO.setVisible (true);
	AndrewDongExpenditures.foodWO.setVisible (true);
	AndrewDongExpenditures.entertainmentWO.setVisible (true);
	AndrewDongExpenditures.laundryWO.setVisible (true);
	AndrewDongExpenditures.transportation1WO.setVisible (true);
	AndrewDongExpenditures.transportation2WO.setVisible (true);
	AndrewDongExpenditures.groomingWO.setVisible (true);
	AndrewDongExpenditures.clothingWO.setVisible (true);
	AndrewDongExpenditures.otherWO.setVisible (true);

	//Checks if user's response regarding summer school
	if (AndrewDongExpenditures.summerSchoolResponse == 1)
	    //outputs cost data
	    AndrewDongExpenditures.summerSchoolCostWO.setVisible (true);

	else if (AndrewDongExpenditures.summerSchoolResponse == 2)
	    //sets the lock visible
	    AndrewDongExpenditures.lock1.setVisible (true);

    }
}

//Sets the next screen
class MonthlyExpenditure implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	////sets the contents of the previous screen invisible
	//regular contents
	AndrewDongExpenditures.yuiAI.setVisible (false);
	AndrewDongExpenditures.text9.setVisible (false);
	AndrewDongExpenditures.text10.setVisible (false);

	//button prompts
	AndrewDongExpenditures.privateInfoButton.setVisible (false);
	AndrewDongExpenditures.weeklyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.monthlyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.yearlyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.saveMoneyButton.setVisible (false);

	////Sets the contents of the next frame visible
	//regular contents
	AndrewDongExpenditures.backButton.setVisible (true);
	AndrewDongExpenditures.monthlyTitle.setVisible (true);

	//cost data
	AndrewDongExpenditures.monthlyEO.setVisible (true);
	AndrewDongExpenditures.tuitionMO.setVisible (true);
	AndrewDongExpenditures.booksMO.setVisible (true);
	AndrewDongExpenditures.accomodationMO.setVisible (true);
	AndrewDongExpenditures.foodMO.setVisible (true);
	AndrewDongExpenditures.entertainmentMO.setVisible (true);
	AndrewDongExpenditures.laundryMO.setVisible (true);
	AndrewDongExpenditures.transportation1MO.setVisible (true);
	AndrewDongExpenditures.transportation2MO.setVisible (true);
	AndrewDongExpenditures.groomingMO.setVisible (true);
	AndrewDongExpenditures.clothingMO.setVisible (true);
	AndrewDongExpenditures.otherMO.setVisible (true);

	//Checks if user's response regarding summer school
	if (AndrewDongExpenditures.summerSchoolResponse == 1)
	    //outputs cost data
	    AndrewDongExpenditures.summerSchoolCostMO.setVisible (true);

	else if (AndrewDongExpenditures.summerSchoolResponse == 2)
	    //sets the lock visible
	    AndrewDongExpenditures.lock1.setVisible (true);
    }
}

//Sets the next screen
class YearlyExpenditure implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
	////sets the contents of the previous screen invisible
	//regular contents
	AndrewDongExpenditures.yuiAI.setVisible (false);
	AndrewDongExpenditures.text9.setVisible (false);
	AndrewDongExpenditures.text10.setVisible (false);

	//button prompts
	AndrewDongExpenditures.privateInfoButton.setVisible (false);
	AndrewDongExpenditures.weeklyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.monthlyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.yearlyExpenditureButton.setVisible (false);
	AndrewDongExpenditures.saveMoneyButton.setVisible (false);

	////Sets the contents of the next frame visible
	//regular contents
	AndrewDongExpenditures.backButton.setVisible (true);
	AndrewDongExpenditures.yearlyTitle.setVisible (true);

	//cost data
	AndrewDongExpenditures.yearlyEO.setVisible (true);
	AndrewDongExpenditures.tuitionYO.setVisible (true);
	AndrewDongExpenditures.booksYO.setVisible (true);
	AndrewDongExpenditures.accomodationYO.setVisible (true);
	AndrewDongExpenditures.foodYO.setVisible (true);
	AndrewDongExpenditures.entertainmentYO.setVisible (true);
	AndrewDongExpenditures.laundryYO.setVisible (true);
	AndrewDongExpenditures.transportation1YO.setVisible (true);
	AndrewDongExpenditures.transportation2YO.setVisible (true);
	AndrewDongExpenditures.groomingYO.setVisible (true);
	AndrewDongExpenditures.clothingYO.setVisible (true);
	AndrewDongExpenditures.otherYO.setVisible (true);

	//Checks if user's response regarding summer school
	if (AndrewDongExpenditures.summerSchoolResponse == 1)
	    //outputs cost data
	    AndrewDongExpenditures.summerSchoolCostYO.setVisible (true);

	else if (AndrewDongExpenditures.summerSchoolResponse == 2)
	    //sets the lock visible
	    AndrewDongExpenditures.lock1.setVisible (true);

    }
}

//Clears textfields
class Clear1 implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
    //sets the text of textfields to null, removes all data
	AndrewDongExpenditures.tuitionTF.setText (null);
	AndrewDongExpenditures.booksTF.setText (null);
	AndrewDongExpenditures.accomodationTF.setText (null);
	AndrewDongExpenditures.foodTF.setText (null);
	AndrewDongExpenditures.entertainmentTF.setText (null);
	AndrewDongExpenditures.laundryTF.setText (null);
    }
}

//Clears textfields
class Clear2 implements ActionListener
{
    public void actionPerformed (ActionEvent event)
    {
    //sets the text of textfields to null, removes all data
	AndrewDongExpenditures.transportation1TF.setText (null);
	AndrewDongExpenditures.transportation2TF.setText (null);
	AndrewDongExpenditures.groomingTF.setText (null);
	AndrewDongExpenditures.clothingTF.setText (null);
	AndrewDongExpenditures.otherTF.setText (null);
	AndrewDongExpenditures.summerSchoolCostTF.setText (null);
    }
}

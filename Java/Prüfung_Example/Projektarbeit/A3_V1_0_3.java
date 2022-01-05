import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A3_V1_0_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// reader
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);

		// Menu
		String menunr = "0";
		while (menunr.intern() != "3") {

			System.out.println("Menu");
			System.out.println("====");
			System.out.println("1) Note eingeben");
			System.out.println("2) Noten ansehen");
			System.out.println("3) Programm beenden");
			System.out.println("");

			// readline (menunr)
			System.out.print("Wählen Sie ein Menupunkt: ");
			System.out.println("");
			menunr = in.readLine();

			// Menüpunkte methode
			if (menunr.intern() == "1") {
				methode_menu_1();
			} else if (menunr.intern() == "2") {
				methode_menu_2();
			} else if (menunr.intern() == "3") {
				System.out.println("Programm wurde beendet");
			} else {
				System.out.println("Ungültige eingabe");
			}
		}

	}

	// Menüpunkt 1
	private static void methode_menu_1() throws IOException {

		// Auslesen
		File file = new File("C:\\Temp\\scores.txt");
		BufferedReader bufRdr = new BufferedReader(new FileReader(file));

		// Array füllen
		String line;
		String line2;
		int zaehlerline = 0;
		while ((line = bufRdr.readLine()) != null) {
			zaehlerline++;
		}
		bufRdr.close();
		BufferedReader bufRdr2 = new BufferedReader(new FileReader(file));
		int zaehler = 0;
		String filearray[] = new String[zaehlerline + 1];
		while ((line2 = bufRdr2.readLine()) != null) {
			filearray[zaehler] = line2;
			zaehler++;
		}

		bufRdr2.close();

		// Eingabe
		// reader
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		// reader File
		File file2 = new File("C:\\Temp\\scores.txt");
		BufferedReader bufRdr3 = new BufferedReader(new FileReader(file2));

		// Eingabe Fach
		System.out.println("Gib ein Fach ein: ");
		String fach;
		fach = in.readLine();

		// Eingabe Datum
		String datum = "0.0.0";
		boolean check = false;
		while (check == false) {
			System.out.println("Gib das Datum der Prüfung ein: ");
			datum = in.readLine();

			String pattern = "^(([1-9]|[12][0-9]|3[01]).([1-9]|1[012]).(19|2[0-9])[0-9]{2})$";
			Pattern p = Pattern.compile(pattern);
			Matcher matcher = p.matcher(datum);
			boolean m = matcher.find();

			if (m) {
				check = true;
			} else {
				System.out.println("Ungültiges Datum");
				System.out.println("Ungültige Eingaben: 4.04.2020");
				System.out.println("                    04.4.2020");
				System.out.println("                    4.4.20");
				System.out.println("Gültige Eingabe:    4.4.2020");
			}
		}


		// Eingabe Note
		System.out.println("Gib die Note der Prüfung ein: ");
		String note;
		note = in.readLine();
		// Note formatieren
		double dnote = Double.parseDouble(note);

		// Fach vorhanden prüfen
		String line3;
		int fachzaehler = -1;
		boolean fachvorhanden = false;
		while ((line3 = bufRdr3.readLine()) != null) {
			StringTokenizer ft = new StringTokenizer(line3, ";");
			String fachtoken = ft.nextToken();
			fachzaehler++;
			if (fachtoken.equals(fach)) {
				fachvorhanden = true;
				break;
			} else {
				fachvorhanden = false;
			}
		}
		if (fachvorhanden == true) {
			filearray[fachzaehler] = filearray[fachzaehler] + ";" + datum + ";" + dnote;
		} else {
			filearray[zaehlerline] = fach + ";" + datum + ";" + note;
		}
		bufRdr3.close();

		// File writer
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
		for (int i = 0; i < filearray.length; i++) {
			if (filearray[i] != null) {
				out.write(filearray[i]);
				out.newLine();
			}
		}
		out.close();

	}

	// Menüpunkt 2
	// reader File
	private static void methode_menu_2() throws IOException {
		File file = new File("C:\\Temp\\scores.txt");
		BufferedReader bufRdr = new BufferedReader(new FileReader(file));

		// reader
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);

		// Eingabe Fach
		System.out.print("Fach eingeben: ");
		String fach = in.readLine();

		// File reader
		String line;
		boolean wronginput = false;
		while ((line = bufRdr.readLine()) != null) {

			StringTokenizer st = new StringTokenizer(line, ";");

			// Noten ausgabe
			// Fach
			String token1 = st.nextToken();
			if (token1.equals(fach)) {
				// Eingabe true
				wronginput = true;
				System.out.println("Noten im Fach <" + token1 + "> :");

				// Datum - Noten
				while (st.hasMoreTokens()) {
					String token2 = st.nextToken();
					String token3 = st.nextToken();

					// Gregorian Calender
					GregorianCalendar date = new GregorianCalendar();

					// Datum Tokenizer
					StringTokenizer datumtoken = new StringTokenizer(token2, ".");
					String day = datumtoken.nextToken();
					String month = datumtoken.nextToken();
					String year = datumtoken.nextToken();

					// String to int (Integer)
					int d = Integer.parseInt(day);
					int m = Integer.parseInt(month);
					int y = Integer.parseInt(year);

					// set date
					date.set(GregorianCalendar.DAY_OF_MONTH, d);
					date.set(GregorianCalendar.MONTH, m - 1);
					date.set(GregorianCalendar.YEAR, y);

					// Ausgabe Noten
					System.out.println(date.getDisplayName(GregorianCalendar.DAY_OF_WEEK, Calendar.LONG, Locale.GERMAN)
							+ ", " + +date.get(GregorianCalendar.DAY_OF_MONTH) + "."
							+ (date.get(GregorianCalendar.MONTH) + 1) + "." + date.get(GregorianCalendar.YEAR)
							+ " - Note: " + token3);

				}

			}

		}
		// Ungültige eingabe
		if (wronginput == false) {
			System.out.println("Ungültige Eingabe");
		}
		bufRdr.close();
	}

}
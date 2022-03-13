package com.simplilearn.Filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Filehandling {

	public static List<String> readFile(String fileName) {

		List<String> list = Collections.emptyList();
		try {

			list = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice;

		System.out.println(" Welcome to File Handling.Options available are :");
		System.out.println("1.Read");
		System.out.println("2.Write");
		System.out.println("3.Append");

		System.out.println("Enter your choice: ");
		choice = sc.nextLine();

		if (choice.equals("1")) {
			
			System.out.println("Enter the file name");
			String fname=sc.next();
			List result=readFile("G:\\Work\\file\\"+fname);
			Iterator<String> it = result.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		} else if (choice.equals("2")) {
			try {
				FileWriter fw = new FileWriter("G:\\Work\\file\\abc.txt");
				fw.write("Use eco-friendly products");
				fw.close();
				System.out.println("File writer has completed !");
			} catch (Exception e) {
				System.out.println("Undefined Exception");
			}
		} else if (choice.equals("3")) {
			
			String filename = ("G:\\Work\\file\\xyz.txt");
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
				bw.write("Mphasis Limited");
				bw.close();
				System.out.println("Append has been done");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
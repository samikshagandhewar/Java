package com.studyopedia;

import java.util.Scanner;
import java.util.ArrayList;

class playlist
	{
	private ArrayList<String> songlist = new ArrayList<>();
	

		public void add_song()
		{ 
			Scanner sc = new Scanner(System.in);
			String song = sc.nextLine();
			songlist.add(song);
		}
		public void remove_song(int index)
		{
			songlist.remove(index);
			System.out.println("The song "+index+" is removed from the playlist");
		}
		public void get_songs()
		{
			ArrayList<String> dup=new ArrayList<>();
			for(String i:songlist) 
			{
				if(!dup.contains(i)) 
				{
					dup.add(i);
				}
			}
			System.out.print(dup);
		}
	}
	public class test {
	
		public static void main(String[] args) {
			playlist p1 = new playlist();
			System.out.println("Enter songs:");
			p1.add_song();
			p1.add_song();
			p1.add_song();
			p1.add_song();
			p1.add_song();
			p1.add_song();
			p1.remove_song(1);
			p1.get_songs();
	
		}
	
	}

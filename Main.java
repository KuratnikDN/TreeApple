package com.group12_1.tree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//@author Dmitry Kuratnik

public class Main {

	public static void main(String[] args) {
		int numTree = 5; //������������ ��������
		int numApple; // ����������� ����� � ������
		Scanner sc = new Scanner(System.in); 
		System.out.println("������� ����������� ��������");
		numTree = sc.nextInt();
		Tree tr; 
		List<Tree> tree = new ArrayList<Tree>();
		
		for(int i = 0; i < numTree; i++){
			tree.add(tr = new Tree());
		} 
		
		for(int i = 0; i < tree.size(); i++){
			numApple = tree.get(i).grow();
			System.out.print(numApple + " ");
		}
		
		System.out.println();
		for(int i = 0; i < tree.size(); i++){
			numApple = tree.get(i).dropApple();
			System.out.print(numApple + " ");
		}
	}

}

package com.sid.DesignPatterns.Structural.Flyweight.trees;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Forest extends JFrame{

	List<Tree> trees = new ArrayList<Tree>();
	
	public void platTrees(int x, int y, String name, Color color, String otherTreeData) {
		TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
		Tree tree = new Tree(x, y, type);
		trees.add(tree);
	}
	
	@Override
	public void paint(Graphics graphics) {
		for(Tree tree: trees) {
			tree.draw(graphics);
		}
	}
}

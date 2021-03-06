package org.virusparadox.maingame;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	
	public LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	
	public void update(){
		for(int i = 0; i < object.size(); i++)
		{
			GameObject tempObj = object.get(i);
			
			tempObj.update();
		}
	}
	
	
	public void render(Graphics gfx){
		for(int i = 0; i < object.size(); i++)
		{
			GameObject tempObj = object.get(i);
			
			tempObj.render(gfx);
		}
	}
	
	public void addObject(GameObject object){
		this.object.add(object);
	}
	
	public void removeObject(GameObject object){
		this.object.remove(object);
	}
	
	


}

package com.donkeykong.game.Worlds;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.donkeykong.game.Entities.Jumpman;
import com.donkeykong.game.Entities.Kong;
import com.donkeykong.game.Entities.Ladder;
import com.donkeykong.game.Entities.Pauline;
import com.donkeykong.game.Entities.Solid;

public class Level1 extends World
{
	private Jumpman jumpman;
	private ArrayList<Solid> solids;
	
	public Level1(OrthographicCamera camera)
	{
		super(camera);
		solids = new ArrayList<Solid>();
		shouldDrawHitbox = false;
		
		Solid solid;
		
		//Ladder base
		addEntity(new Ladder(80,8));
		addEntity(new Ladder(80,30));
		addEntity(new Ladder(184,13));
		addEntity(new Ladder(184,21));
		addEntity(new Ladder(96,42));
		addEntity(new Ladder(64,72));
		addEntity(new Ladder(32,46));
		addEntity(new Ladder(64,96));
		addEntity(new Ladder(112,75));
		addEntity(new Ladder(184,80));
		addEntity(new Ladder(168,104));
		addEntity(new Ladder(72,110));
		addEntity(new Ladder(32,112));
		addEntity(new Ladder(88,139));
		addEntity(new Ladder(88,160));
		addEntity(new Ladder(184,145));
		addEntity(new Ladder(128,172));
		addEntity(new Ladder(80,172));
		addEntity(new Ladder(64,172));
		addEntity(new Ladder(168,130));
		
		addEntity(new Ladder(96,50));
		addEntity(new Ladder(96,58));
		addEntity(new Ladder(32,54));
		addEntity(new Ladder(112,83));
		addEntity(new Ladder(112,91));
		addEntity(new Ladder(184,88));
		addEntity(new Ladder(72,118));
		addEntity(new Ladder(72,126));
		addEntity(new Ladder(32,120));
		addEntity(new Ladder(184,153));
		addEntity(new Ladder(128,180));
		addEntity(new Ladder(80,180));
		addEntity(new Ladder(64,180));
		addEntity(new Ladder(128,188));
		addEntity(new Ladder(80,188));
		addEntity(new Ladder(64,188));
		addEntity(new Ladder(80,196));
		addEntity(new Ladder(64,196));
		addEntity(new Ladder(80,204));
		addEntity(new Ladder(64,204));
		addEntity(new Ladder(80,212));
		addEntity(new Ladder(64,212));
		
		//Floor1
		for(int i=0;i<14;i++)
		{
			solid = new Solid(i*8,0,8,8);
			solids.add(solid);
			addEntity(solid);
		}
		for(int i=14;i<28;i++)
		{
			solid = new Solid(i*8,Math.round((i-13)/2f),8,8);
			solids.add(solid);
			addEntity(solid);
		}
		
		//Floor2
		for(int i=0;i<26;i++)
		{
			solid = new Solid(i*8,41 - Math.round((i+1)/2f),8,8);
			solids.add(solid);
			addEntity(solid);
		}
		
		//Floor 3
		for(int i=1;i<28;i++)
		{
			solid = new Solid((i*8)+16,61 + Math.round(i/2f),8,8);
			solids.add(solid);
			addEntity(solid);
		}
		
		//Floor4
		for(int i=0;i<26;i++)
		{
			solid = new Solid(i*8,107 - Math.round((i+1)/2f),8,8);
			solids.add(solid);
			addEntity(solid);
		}
		
		//Floor 5
		for(int i=1;i<28;i++)
		{
			solid = new Solid((i*8)+16,128 + Math.round(i/2f),8,8);
			solids.add(solid);
			addEntity(solid);
		}
		
		//Floor6
		for(int i=0;i<18;i++)
		{
			solid = new Solid(i*8,165,8,8);
			solids.add(solid);
			addEntity(solid);
		}
		for(int i=18;i<26;i++)
		{
			solid = new Solid(i*8,165 - Math.round((i-17)/2f),8,8);
			solids.add(solid);
			addEntity(solid);
		}
		
		//Floor 7
		for(int i=11;i<17;i++)
		{
			solid = new Solid(i*8,193,8,8);
			solids.add(solid);
			addEntity(solid);
		}
		
		jumpman = new Jumpman(9,9);
		addEntity(jumpman);
		addEntity(new Pauline(88,201));
		addEntity(new Kong(16,173,jumpman));
	}
	
	@Override
	public void update(float dt)
	{
		super.update(dt);
		if(Gdx.input.isKeyJustPressed(Keys.Q))
			shouldDrawHitbox = !shouldDrawHitbox;
	}
	

}

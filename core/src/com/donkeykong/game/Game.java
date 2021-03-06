package com.donkeykong.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.donkeykong.game.Worlds.Level1;
import com.donkeykong.game.Worlds.World;

public class Game extends ApplicationAdapter
{
	public static final int WIDTH = 224;
	public static final int HEIGHT = 256;
	public static final int SCALE = 2;
	
	SpriteBatch batch;
	World world;
	OrthographicCamera camera;
	
	@Override
	public void create ()
	{
		batch = new SpriteBatch();
		camera = new OrthographicCamera(WIDTH, HEIGHT);
		world = new Level1(camera);
		
		camera.position.x = WIDTH *0.5f;
		camera.position.y = HEIGHT *0.5f;
		
		Gdx.input.setInputProcessor(world);
	}

	@Override
	public void render ()
	{
		camera.update();
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(camera.combined);
		world.update(Gdx.graphics.getDeltaTime());
		world.draw(batch);
		world.drawHitbox();
		world.updateList();
		
		if(world.resetFlag)
			world = new Level1(camera);
	}
	
	public void changeWorld(World world)
	{
		this.world = world;
		Gdx.input.setInputProcessor(world);
	}
}

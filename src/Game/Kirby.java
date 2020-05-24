package Game;

import Engine.ImageLoader;
import Engine.Key;
import Engine.Keyboard;
import Engine.Graphics;
import GameObject.*;
import GameObject.Frame;
import GameObject.FrameBuilder;
import GameObject.Rectangle;
import Map.Map;
import Map.Player;

import java.util.HashMap;

public class Kirby extends Player {

    public Kirby(float x, float y, Rectangle sceneBounds) {
        super(new SpriteSheet(ImageLoader.load("Kirby.png"), 24, 24), x, y, sceneBounds, "STAND_RIGHT");
        gravity = .5f;
        terminalVelocityY = 6f;
        jumpHeight = 20f;
        jumpDegrade = .5f;
        walkSpeed = 2f;
        momentumYIncrease = 2f;
        JUMP_KEY = Key.W;
        MOVE_LEFT_KEY = Key.A;
        MOVE_RIGHT_KEY = Key.D;
        CROUCH_KEY = Key.S;
    }

    public void update(Keyboard keyboard, Map map) {
        super.update(keyboard, map);
    }

    public void draw(Graphics graphics) {
        super.draw(graphics);
        //drawBounds(graphics, new Color(255, 0, 0, 170));
    }

    @Override
    public HashMap<String, Frame[]> getAnimations(SpriteSheet spriteSheet) {
        return new HashMap<String, Frame[]>() {{
            put("STAND_RIGHT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 0)
                            .withScale(2)
                            .withBounds(6, 5, 12, 14)
                            .build()
            });

            put("STAND_LEFT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 0)
                            .withScale(2)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(6, 5, 12, 14)
                            .build()
            });

            put("WALK_RIGHT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(1, 0), 200)
                            .withScale(2)
                            .withBounds(6, 5, 12, 14)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 1), 200)
                            .withScale(2)
                            .withBounds(6, 5, 12, 14)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 2), 200)
                            .withScale(2)
                            .withBounds(6, 5, 12, 14)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 3), 200)
                            .withScale(2)
                            .withBounds(6, 5, 12, 14)
                            .build()
            });

            put("WALK_LEFT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(1, 0), 200)
                            .withScale(2)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(6, 5, 12, 14)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 1), 200)
                            .withScale(2)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(6, 5, 12, 14)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 2), 200)
                            .withScale(2)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(6, 5, 12, 14)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(1, 3), 200)
                            .withScale(2)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(6, 5, 12, 14)
                            .build()
            });

            put("CROUCH_RIGHT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(2, 0), 0)
                            .withScale(2)
                            .withBounds(6, 12, 12, 7)
                            .build()
            });

            put("CROUCH_LEFT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(2, 0), 0)
                            .withScale(2)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(6, 12, 12, 7)
                            .build()
            });

            put("JUMP_RIGHT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(3, 0), 0)
                            .withScale(2)
                            .withBounds(6, 5, 12, 14)
                            .build()
            });

            put("JUMP_LEFT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(3, 0), 0)
                            .withScale(2)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(6, 5, 12, 14)
                            .build()
            });

            put("FALL_RIGHT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(4, 0), 0)
                            .withScale(2)
                            .withBounds(6, 5, 12, 14)
                            .build()
            });

            put("FALL_LEFT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(4, 0), 0)
                            .withScale(2)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(6, 5, 12, 14)
                            .build()
            });
        }};
    }
}

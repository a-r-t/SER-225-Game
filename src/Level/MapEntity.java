package Level;

import GameObject.*;

import java.awt.image.BufferedImage;
import java.util.HashMap;

// This class represents a map entity, which is any "entity" on a map besides the player
// it is basically a game object with a few extra features for handling things like respawning
public class MapEntity extends GameObject {
    protected MapEntityStatus mapEntityStatus = MapEntityStatus.ACTIVE;
  

    // if true, if entity goes out of the camera's update range, and then ends up back in range, the entity will "respawn" back to its starting parameters
    protected boolean isRespawnable = true;

    // if true, enemy cannot go out of camera's update range
    protected boolean isUpdateOffScreen = false;

    public MapEntity(float x, float y, SpriteSheet spriteSheet, String startingAnimation) {
        super(spriteSheet, x, y, startingAnimation);
    }

    public MapEntity(float x, float y, HashMap<String, Frame[]> animations, String startingAnimation) {
        super(x, y, animations, startingAnimation);
    }

    public MapEntity(BufferedImage image, float x, float y, String startingAnimation) {
        super(image, x, y, startingAnimation);
    }

    public MapEntity(BufferedImage image, float x, float y) {
        super(image, x, y);
    }

    public MapEntity(BufferedImage image, float x, float y, float scale) {
        super(image, x, y, scale);
    }

    public MapEntity(BufferedImage image, float x, float y, float scale, ImageEffect imageEffect) {
        super(image, x, y, scale, imageEffect);
    }

    public MapEntity(BufferedImage image, float x, float y, float scale, ImageEffect imageEffect, Rectangle bounds) {
        super(image, x, y, scale, imageEffect, bounds);
    }

    public void initialize() {
        this.x = startPositionX;
        this.y = startPositionY;
        this.amountMovedX = 0;
        this.amountMovedY = 0;
        this.previousX = startPositionX;
        this.previousY = startPositionY;
        updateCurrentFrame();
    }

    public MapEntityStatus getMapEntityStatus() {
        return mapEntityStatus;
    }

    public void setMapEntityStatus(MapEntityStatus mapEntityStatus) {
        this.mapEntityStatus = mapEntityStatus;
    }

    public boolean isRespawnable() {
        return isRespawnable;
    }

    public void setIsRespawnable(boolean isRespawnable) {
        this.isRespawnable = isRespawnable;
    }

    public boolean isUpdateOffScreen() {
        return isUpdateOffScreen;
    }

    public void setIsUpdateOffScreen(boolean isUpdateOffScreen) {
        this.isUpdateOffScreen = isUpdateOffScreen;
    }
    
}

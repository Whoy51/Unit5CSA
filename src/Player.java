public class Player {

    private static int numPlayers = 0;

    private int x;
    private int y;
    private int z;
    private int direction;
    private int hp;
    private String name;

    /**
     * Default player
     */
    public Player(){
        this("P" + (numPlayers + 1), 0, 0, 0 , 20, 1);
    }

    /**
     * Create player with minimal information
     * @param name name
     * @param x x, as whole number
     * @param y y, as whole number
     * @param z z, as whole number
     */
    public Player(String name, int x, int y, int z){
        this(name, x, y, z, 20, 1);
    }

    /**
     * Create player with complete information
     * @param name name
     * @param x x, as whole number
     * @param y y, as whole number
     * @param z z, as whole number
     * @param health hit points
     * @param direction direction facing, 1-6
     */
    public Player(String name, int x, int y, int z, int health, int direction){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        setHp(health);
        if (direction < 1 || direction > 6) {
            this.direction = 1;
        }else {
            this.direction = direction;
        }
        numPlayers++;
    }

    /**
     * Set the hit points
     * @param hp Amount of hit points
     */
    public void setHp(int hp){
        if (hp < 0){
            this.hp = 0;
        }else {
            this.hp = hp;
        }
    }

    /**
     * Set the direction
     * @param direction The direction, 1-6
     */
    public void setDirection(int direction){
        if (!(direction < 1 || direction > 6)) {
            this.direction = direction;
        }
    }

    /**
     * Move in specified direction in units
     * @param direction direction to move
     * @param units amount of spaces to move
     */
    public void move(int direction, int units){
        switch (direction){
            case 1:
                x += units;
                break;
            case 2:
                x -= units;
                break;
            case 3:
                y += units;
                break;
            case 4:
                y -= units;
                break;
            case 5:
                z += units;
                break;
            case 6:
                z -= units;
                break;
        }
    }

    /**
     * Attack player, removing specified amount of hit points,
     * and giving half that to player attacking
     * @param player player being attacked
     * @param damage amount of damage to target and twice amount added to hp
     */
    public void attack(Player player, int damage){
        player.setHp(player.getHp() - damage);
        this.hp += (damage /2);
    }

    /**
     * Move to specified coordinates
     * @param x x
     * @param y y
     * @param z z
     */
    public void teleport(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Move to other player's position
     * @param player player to move to
     */
    public void teleport(Player player){
        this.x = player.getX();
        this.y = player.getY();
        this.z = player.getZ();
    }

    /**
     * Get the name
     * @return the name
     */
    public String getName(){
        return name;
    }

    /**
     * Get the X pos
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Get the Y pos
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * Get the Z pos
     * @return z
     */
    public int getZ() {
        return z;
    }

    /**
     * Get the direction
     * @return direction, 1-6
     */
    public int getDirection() {
        return direction;
    }

    /**
     * Gets the number of player objects created
     * @return num of players
     */
    public static int getNumPlayers() {
        return numPlayers;
    }

    /**
     * Get the Hp
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * Get the distance to other coordinate
     * @param x x
     * @param y y
     * @param z z
     * @return the distance, in decimals
     */
    public double getDistance(int x, int y, int z){
        int xDist = Math.abs(x - this.x);
        int yDist = Math.abs(y - this.y);
        int zDist = Math.abs(z - this.z);

        return Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2) + Math.pow(zDist, 2));
    }

    /**
     * Get distance to other player
     * @param player other player
     * @return the distance, in decimals
     */
    public double getDistance(Player player){
        return getDistance(player.getX(), player.getY(), player.getZ());
    }

    /**
     * Return details
     * @return Name, Health, Coordinate, and Direction
     */
    public String toString() {
        return "Name: " + name +
                "\nHealth: " + hp +
                "\nCoordinates: X " + x + " Y " + y + " Z " + z +
                "\nDirection: " + direction;
    }
}

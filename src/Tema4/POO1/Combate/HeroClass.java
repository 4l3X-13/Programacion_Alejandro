package Tema4.POO1.Combate;
public class HeroClass {
    String name;
    private int level;
    private int health;
    private int maxHealth;
    private int expience;
    private int attack;
    private int defense;

    //cuidado con final que no se puede cambiar que ponemos oomo final?
    //nombre, nivel base, vida maxima porque asi sgun la logica
    //aumenta nivel personaje asi que necesita cambiar la experencia da mas ataque y mas def y la vida varia
    private final String BASE_NAME = "pepe";
    private final int BASE_LEVEL = 10;
    private int BASE_HEALTH = 100;
    private final int BASE_MAXHEALTH = 100;
    private int BASE_EXPERINCE = 10;
    private int BASE_ATACK = 10;
    private int BASE_DEFENSE = 150;

    //CONTRUCTORES
    //se llama igual que nuestra clase pero sin class
    public HeroClass(String name, int level, int health, int maxHealth, int experince, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.expience = experince;
        this.attack = attack;
        this.defense = defense;

    }

    //Constructores vacios
    public HeroClass() {
        this.name = BASE_NAME;
        this.level = BASE_LEVEL;
        this.health = BASE_HEALTH;
        this.maxHealth = BASE_MAXHEALTH;
        this.expience = BASE_EXPERINCE;
        this.attack = BASE_ATACK;
        this.defense = BASE_DEFENSE;
    }
    //getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExpience() {
        return expience;
    }

    public void setExpience(int expience) {
        this.expience = expience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    //metodos
    // drink postion +10 vida
    public void drinkPotion() {
        if (this.health < maxHealth) {
            this.health = this.health + 10;
            System.out.println("has recuperado algo de vida" + this.health);
        } else {
            System.out.println("estas a tope de vida mi pana");

        }
    }

    public void rest() {
        this.health = this.health + 50;
        if (this.health <= maxHealth) {
            System.out.println("descansar");
        } else {
            //hacemos que el valor vuelva a 100 forzandolo
            this.health = this.maxHealth;
            System.out.println("estas a tope de vida mi pana");
        }


    }

    //usamos como parametro la clase Hero y le ponemos enemigo
    //que pasa que ahora ya no es this. ahora es enemigo.pq nos referimos a def enemigo vida enemigo...
    public void attack(HeroClass enemigo) {
        int danioEfectivo = this.attack - enemigo.defense;
        if (danioEfectivo < 10) {
            danioEfectivo = 10;

        }
        enemigo.health = enemigo.health - danioEfectivo;
        this.expience = this.expience + 10;
        if (this.expience >= 50) {
            this.levelUp();
        }
    }

    public void levelUp() {
        this.health = this.health + 5;
        this.attack++;
        this.defense++;
        this.level++;
        //reiniciciamos a 0 porque acabamos de subir de nivel si no subiriamos en cada ataque
        this.expience = 0;

    }

    @Override
    public String toString() {
        return "nombre" + name + "nivel" + "vida" + health + "experiencia" + expience + "ataque" + attack + "defensa" + defense;
    }

}
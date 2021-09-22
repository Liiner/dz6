import java.util.Scanner;

public class Animals {

    public static int run;
    public static int swim;
    public static String name;
    public static int stat;

    public Animals() {
    }

    public static void infoObstacles(String name, int run, int swim) {
        System.out.print(name + " пробежал " + run + " m" + " проплыл " + swim + " m");

    }
    public static void infoObstacles(String name,  int run) {
        System.out.print(name + " пробежал " + run + " m");
    }

    public static void askName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя животного");
        Animals.name = sc.nextLine();
    }

    public static void askRun(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Сколько метров пробежало животное?");
    Animals.run = Integer.parseInt(sc.nextLine());
}

    public static void askSwim() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько метров проплыло животное?");
        Animals.swim = Integer.parseInt(sc.nextLine());
    }

    public static void askAddDog() {
        for (int i = 0; i < 2; i++) {
            stat++;
            askName();
            askRun();
            askSwim();
            if (run > 500 || swim > 10) {
                System.out.println("Собаки не могут бегать больше 500m и плавать 10m");
                return;
            }
            Animals.infoObstacles(name, run, swim);
            System.out.println();

            System.out.println("Хотите добавить еще собаку? yes=1 или no=0");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a == 1){
                i = 0;
            }
            if (a == 0){
                i = 3;
                sc.close();
                System.out.println("Собак записали :" + stat);
            }
        }
    }
    public static void askAddCat() {
    for (int i = 0; i < 2; i++) {
        stat++;
        askName();
        askRun();
        if (run > 200) {
            System.out.println("Кошки не могут бегать больше 200m");
            System.out.println("Кошек записали :" + (stat - 1));
            return;}
        Animals.infoObstacles(name, run);
        System.out.println();
        System.out.println("Хотите добавить еще кошеку yes=1 или no=0");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            i = 0;
        }
        if (a == 0) {
            i = 3;
            sc.close();
            System.out.println("Кошек записали :" + stat);
        }
    }
}
    public int getRun() {
        return run;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Animals.name = name;
    }

    public int getSwim() {
        return swim;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}

package com.example.javagameprj;

class Rooms {
    private static int maxRooms = 2;
    int floor;
    int cycle;
    Rooms() {
        this.floor = 1;
        this.cycle = 1;
    }

    public void MoveToStartRoom(Enemy enemy) {
        enemy.HP = 0;
        enemy.DMG = 0;
        System.out.print("|||||||||||||||||||||||||||||||" + "\n");
        System.out.print("|||||||||||         |||||||||||" + "\n");
        System.out.print("|||||||||             |||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("          Start room           " + "\n");
    }

    private void SlimeRoom(Enemy enemy) {
        enemy.HP = 20 * this.cycle;
        enemy.DMG = 2 * this.cycle;
        enemy.type = "Standard";
        System.out.print("|||||||||||||||||||||||||||||||" + "\n");
        System.out.print("|||||||||||         |||||||||||" + "\n");
        System.out.print("|||||||||             |||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||    _______    ||||||||" + "\n");
        System.out.print("||||||||    |     |    ||||||||" + "\n");
        System.out.print("||||||||    |_____|    ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("  You are attacked by slime!   " + "\n");
    }

    private void SkeletonRoom(Enemy enemy) {
        enemy.HP = 25 * this.cycle;
        enemy.DMG = 3 * this.cycle;
        enemy.type = "Standard";
        System.out.print("|||||||||||||||||||||||||||||||" + "\n");
        System.out.print("|||||||||||         |||||||||||" + "\n");
        System.out.print("|||||||||     ___     |||||||||" + "\n");
        System.out.print("||||||||     /| |\\     ||||||||" + "\n");
        System.out.print("||||||||     \\ - /     ||||||||" + "\n");
        System.out.print("||||||||      /|\\      ||||||||" + "\n");
        System.out.print("||||||||       |       ||||||||" + "\n");
        System.out.print("||||||||      / \\      ||||||||" + "\n");
        System.out.print(" You are attacked by skeleton! " + "\n");
    }

    private void PaladinRoom(Enemy enemy) {
        enemy.HP = 30 * this.cycle;
        enemy.DMG = 4 * this.cycle;
        enemy.type = "Standard";
        System.out.print("|||||||||||||||||||||||||||||||" + "\n");
        System.out.print("|||||||||||         |||||||||||" + "\n");
        System.out.print("|||||||||     ___     |||||||||" + "\n");
        System.out.print("||||||||     /| |\\     ||||||||" + "\n");
        System.out.print("||||||||     \\ - /     ||||||||" + "\n");
        System.out.print("||||||||   /---\\|\\     ||||||||" + "\n");
        System.out.print("||||||||   |   || \\    ||||||||" + "\n");
        System.out.print("||||||||    \\_/  \\     ||||||||" + "\n");
        System.out.print("  You are attacked by paladin! " + "\n");
    }

    private void PotionRoom(mainHero hero) {
        hero.HP += 40 * this.cycle;
        System.out.print("|||||||||||||||||||||||||||||||" + "\n");
        System.out.print("|||||||||||         |||||||||||" + "\n");
        System.out.print("|||||||||             |||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||      _        ||||||||" + "\n");
        System.out.print("||||||||     |-|       ||||||||" + "\n");
        System.out.print("||||||||    /```\\      ||||||||" + "\n");
        System.out.print("||||||||    |___|      ||||||||" + "\n");
        System.out.print("You have recovered " + 40 * this.cycle + " health points." + "\n");
    }

    private void DMGUpRoom(mainHero hero) {
        hero.DMG += 2 * this.cycle;
        System.out.print("|||||||||||||||||||||||||||||||" + "\n");
        System.out.print("|||||||||||         |||||||||||" + "\n");
        System.out.print("|||||||||             |||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||    _______    ||||||||" + "\n");
        System.out.print("||||||||   /__|_|__\\   ||||||||" + "\n");
        System.out.print("||||||||   |-------|   ||||||||" + "\n");
        System.out.print("Your damage is increased by " + 2 * this.cycle + " points" + "\n");
    }

    private void ClearRoom(Enemy enemy) {
        enemy.HP = 0;
        enemy.DMG = 0;
        System.out.print("|||||||||||||||||||||||||||||||" + "\n");
        System.out.print("|||||||||||         |||||||||||" + "\n");
        System.out.print("|||||||||             |||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("      This room is empty.      " + "\n");
    }

    void EnemyKilled(Enemy enemy) {
        enemy.HP = 0;
        enemy.DMG = 0;
        System.out.print("|||||||||||||||||||||||||||||||" + "\n");
        System.out.print("|||||||||||         |||||||||||" + "\n");
        System.out.print("|||||||||             |||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("||||||||               ||||||||" + "\n");
        System.out.print("         Enemy killed!         " + "\n");
    }

    private void SlimeBossRoom(Enemy enemy) {
        enemy.HP = 100 * this.cycle;
        enemy.DMG = 10 * this.cycle;
        enemy.type = "Boss";
        System.out.print("|||||||||||||||||||||||||||||||" + "\n");
        System.out.print("|||||||||||         |||||||||||" + "\n");
        System.out.print("|||||||||             |||||||||" + "\n");
        System.out.print("||||||||  ___________  ||||||||" + "\n");
        System.out.print("||||||||  |         |  ||||||||" + "\n");
        System.out.print("||||||||  |         |  ||||||||" + "\n");
        System.out.print("||||||||  |         |  ||||||||" + "\n");
        System.out.print("||||||||  |_________|  ||||||||" + "\n");
        System.out.print("    Before you giant slime!    " + "\n");
    }

    void RandomRoom(Enemy enemy, mainHero Hero) {
        int rnd = 1 + (int) (Math.random() * maxRooms);
        if (this.floor == 10 || this.floor ==  20 || this.floor ==  30) {
            this.SlimeBossRoom(enemy);
        }
        else if (this.floor == 31) {
            this.floor = 1;
            this.MoveToStartRoom(enemy);
            System.out.print("Cycle number " + this.cycle + "\n");
            this.cycle += 1;
        }
        else if (rnd == 1 && this.floor > 1 && this.floor < 10) {
            this.SlimeRoom(enemy);
        }
        else if (rnd == 1 && this.floor > 10 && this.floor < 20) {
            this.SkeletonRoom(enemy);
        }
        else if (rnd == 1 && this.floor > 20 && this.floor < 30) {
            this.PaladinRoom(enemy);
        }
        else if (rnd == 2) {
            int Rnd = 1 + (int) (Math.random() * 3);
            if (Rnd == 3) this.PotionRoom(Hero);
            else if (Rnd == 2) this.DMGUpRoom(Hero);
            else this.ClearRoom(enemy);
        }
        this.floor += 1;
    }
}
package CodeForces;

import java.util.*;

public class GTA {
    static final int MOD = 998244353;
    static class Monster {
        long attack;
        long shot;
        public Monster(long attack, long health, long k) {
            this.attack = attack;
            this.shot = (health+k-1)/k;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] att = new long[n];
        long[] ht = new long[n];
        for (int i=0; i<n; i++) {
            att[i]=sc.nextLong();
        }
        for (int i=0; i<n; i++) {
            ht[i]=sc.nextLong();
        }
        List<Monster> mon = new ArrayList<>();
        for (int i=0; i<n; i++) {
            mon.add(new Monster(att[i], ht[i], k));
        }
        mon.sort((m1, m2) -> {
            if (m1.attack != m2.attack) {
                return Long.compare(m2.attack, m1.attack);
            } else {
                return Long.compare(m1.shot, m2.shot);
            }
        });
        long sumDamage=0;
        long sumAttack=0;
        for (Monster m :mon) {
            sumAttack +=m.attack;
        }
        for (Monster m :mon) {
            sumDamage=(sumDamage+(sumAttack*m.shot)%MOD)%MOD;
            sumAttack -=m.attack;
        }
        long minHealth=(sumDamage+1)%MOD;
        System.out.println(minHealth);
    }
}
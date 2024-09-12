package packageFraction;

public class TestFraction {

	public static void main(String[] args) {
		// Tests de base
		System.out.println("Tests de base");

		Fraction f = new Fraction(3, 2);

		if (f.getNum()==3) System.out.println("[ok] numerateur vaut bien 3");
		else System.out.println("[echec] numerateur vaut 3, on trouve : "+String.valueOf(f.getNum()));
		if (f.getDen()==2) System.out.println("[ok] denominateur vaut bien 2");
		else System.out.println("[echec] numerateur vaut 2, on trouve : "+String.valueOf(f.getDen()));

		f.setNum(5); 
		if (f.getNum()==5) System.out.println("[ok] numerateur vaut bien 5");
		else System.out.println("[echec] numerateur vaut 5, on trouve : "+String.valueOf(f.getNum()));
		if (f.getDen()==2) System.out.println("[ok] denominateur vaut bien 2");
		else System.out.println("[echec] numerateur vaut 2, on trouve : "+String.valueOf(f.getDen()));

		f.setDen(7); 
		if (f.getNum()==5) System.out.println("[ok] numerateur vaut bien 5");
		else System.out.println("[echec] numerateur vaut 5, on trouve : "+String.valueOf(f.getNum()));
		if (f.getDen()==7) System.out.println("[ok] denominateur vaut bien 7");
		else System.out.println("[echec] numerateur vaut 7, on trouve : "+String.valueOf(f.getDen()));

		f.setDen(0); // ne doit pas �tre modifi�, d�nominateur � 0 non valide
		if (f.getNum()==5) System.out.println("[ok] numerateur vaut bien 5");
		else System.out.println("[echec] numerateur vaut 5, on trouve : "+String.valueOf(f.getNum()));
		if (f.getDen()==7) System.out.println("[ok] denominateur vaut bien 7 et non 0!!!");
		else System.out.println("[echec] numerateur vaut 7, on trouve : "+String.valueOf(f.getDen()));

		f = new Fraction(-5, 2);
		if (f.getNum()==-5) System.out.println("[ok] numerateur vaut bien -5");
		else System.out.println("[echec] numerateur vaut -5, on trouve : "+String.valueOf(f.getNum()));
		if (f.getDen()==2) System.out.println("[ok] denominateur vaut bien 2");
		else System.out.println("[echec] numerateur vaut 2, on trouve : "+String.valueOf(f.getDen()));

		f = new Fraction(5, -2);
		if (f.getNum()==5) System.out.println("[ok] numerateur vaut bien 5");
		else System.out.println("[echec] numerateur vaut 5, on trouve : "+String.valueOf(f.getNum()));
		if (f.getDen()==-2) System.out.println("[ok] denominateur vaut bien -2");
		else System.out.println("[echec] numerateur vaut -2, on trouve : "+String.valueOf(f.getDen()));
		System.out.println();

		// Test PGCD
		System.out.println("Tests pgcd");
		if (Fraction.pgcd(2, 2)==2) System.out.println("[ok] pgcd(2,2) vaut bien 2");
		else System.out.println("[echec] pgcd(2,2) vaut 2, on trouve : "+String.valueOf(Fraction.pgcd(2, 2)));
		if (Fraction.pgcd(12, 15)==3) System.out.println("[ok] pgcd(12,15) vaut bien 3");
		else System.out.println("[echec] pgcd(2,2) vaut 2, on trouve : "+String.valueOf(Fraction.pgcd(12,15)));
		if (Fraction.pgcd(1, 15)==1) System.out.println("[ok] pgcd(1,15) vaut bien 1");
		else System.out.println("[echec] pgcd(1,15) vaut 1, on trouve : "+String.valueOf(Fraction.pgcd(1,15)));
		if (Fraction.pgcd(-1,2)==-1) System.out.println("[ok] pgcd(-1,2) vaut bien -1");
		else System.out.println("[echec] pgcd(-1,2) vaut -1, on trouve : "+String.valueOf(Fraction.pgcd(-1,2)));
		if (Fraction.pgcd(1,-2)==1) System.out.println("[ok] pgcd(1,-2) vaut bien -1");
		else System.out.println("[echec] pgcd(1,-2) vaut 1, on trouve : "+String.valueOf(Fraction.pgcd(1,-2)));
		System.out.println();

		//Tests multiplieParCoeff
		System.out.println("Tests multiplieParCoeff");
		f = new Fraction(3, 7);
		f.multiplierParCoeff(4);
		if (f.getNum()==12) System.out.println("[ok] 4*(3/7) numerateur vaut bien 12");
		else System.out.println("[echec] (4*(3/7) numerateur vaut 12, on trouve : "+String.valueOf(f.getNum()));
		if (f.getDen()==7) System.out.println("[ok] 4*(3/7) numerateur vaut bien 7");
		else System.out.println("[echec] (4*(3/7) d�nomnateur vaut 7, on trouve : "+String.valueOf(f.getDen()));

		f = new Fraction(3, 7);
		f.multiplierParCoeff(-5);
		if (f.getNum()==-15) System.out.println("[ok] -5*(3/7) numerateur vaut bien -15");
		else System.out.println("[echec] (-5*(3/7) numerateur vaut -15, on trouve : "+String.valueOf(f.getNum()));
		if (f.getDen()==7) System.out.println("[ok] -5*(3/7) numerateur vaut bien 7");
		else System.out.println("[echec] (-5*(3/7) d�nominateur vaut 7, on trouve : "+String.valueOf(f.getDen()));
		System.out.println();

		// Tests inverse
		System.out.println("Tests inverse");
		f = new Fraction(3, 2);
		f.inverse();
		if (f.getNum()==2) System.out.println("[ok] inverse(3/2) numerateur vaut bien 2");
		else System.out.println("[echec] inverse(3/2) numerateur vaut 2 , on trouve : "+String.valueOf(f.getDen()));
		if (f.getDen()==3) System.out.println("[ok] inverse(3/2) denominateur vaut bien 3");
		else System.out.println("[echec] inverse(3/2) denominateur vaut 3 , on trouve : "+String.valueOf(f.getDen()));

		f = new Fraction(0, 2);
		f.inverse(); // ne doit pas �tre modifi� x/0 invalide
		if (f.getNum()==0) System.out.println("[ok] inverse(0/2) numerateur vaut bien 0");
		else System.out.println("[echec] inverse(0/2) numerateur vaut 0, on trouve : "+String.valueOf(f.getDen()));
		if (f.getDen()==2) System.out.println("[ok] inverse(0/2) denominateur vaut bien 2");
		else System.out.println("[echec] inverse(0/2) denominateur vaut 2, on trouve : "+String.valueOf(f.getDen()));

		f = new Fraction(-5, 2);
		f.inverse();
		if (f.getNum()==2) System.out.println("[ok] inverse(-5/2) numerateur vaut bien 2");
		else System.out.println("[echec] inverse(-5/2) numerateur vaut 2, on trouve : "+String.valueOf(f.getDen()));
		if (f.getDen()==-5) System.out.println("[ok] inverse(-5/2) denominateur vaut bien -5");
		else System.out.println("[echec] inverse(-5/2) denominateur vaut -5, on trouve : "+String.valueOf(f.getDen()));

		f = new Fraction(5, -2);
		f.inverse();
		if (f.getNum()==-2) System.out.println("[ok] inverse(5/-2) numerateur vaut bien -2");
		else System.out.println("[echec] inverse(5/-2) numerateur vaut -2, on trouve : "+String.valueOf(f.getDen()));
		if (f.getDen()==5) System.out.println("[ok] inverse(5/-2) denominateur vaut bien 5");
		else System.out.println("[echec] inverse(5/-2) denominateur vaut 5, on trouve : "+String.valueOf(f.getDen()));
		System.out.println();

		// Tests reduire
		System.out.println("Tests reduire");
		f = new Fraction(1, 2);
		f.reduire();
		if (f.getNum()==1 && f.getDen()==2) System.out.println("[ok] reduire(1/2) vaut bien 1/2");
		else System.out.println("[echec] reduire(1/2) vaut 1/2, on trouve : "+ String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(2, 4);
		f.reduire();
		if (f.getNum()==1 && f.getDen()==2) System.out.println("[ok] reduire(2/4) vaut bien 1/2");
		else System.out.println("[echec] reduire(2/4) vaut 1/2, on trouve : "+ String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(-1, -2);
		f.reduire();
		if (f.getNum()==1 && f.getDen()==2) System.out.println("[ok] reduire(-1/-2) vaut bien 1/2");
		else System.out.println("[echec] reduire(-1/-2) vaut 1/2, on trouve : "+ String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(4, 1);
		f.reduire();
		if (f.getNum()==4 && f.getDen()==1) System.out.println("[ok] reduire(4/1) vaut bien 4/1");
		else System.out.println("[echec] reduire(4/1) vaut 4/1, on trouve : "+ String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(-1, 2);
		f.reduire();
		if (f.getNum()==-1 && f.getDen()==2) System.out.println("[ok] reduire(-1/2) vaut bien -1/2");
		else System.out.println("[echec] reduire(-1/2) vaut -1/2, on trouve : "+ String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(1, -2);
		f.reduire();
		if (f.getNum()==-1 && f.getDen()==2) System.out.println("[ok] reduire(1/-2) vaut bien -1/2");
		else System.out.println("[echec] reduire1/-2) vaut -1/2, on trouve : "+ String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));
		System.out.println();

		// Tests egaleA
		System.out.println("Tests egaleA");
		f = new Fraction(1, 2);
		if (f.egaleA(f)) System.out.println("[ok] 1/2 == 1/2 ");
		else System.out.println("[echec] 1/2 != 1/2!!!!: ");

		Fraction f2 = new Fraction(2, 4);
		if (f.egaleA(f2)) System.out.println("[ok] 1/2 == 2/4");
		else System.out.println("[echec] 1/2 != 2/7!!!!: ");

		f2 = new Fraction(1, 3);
		if (!f.egaleA(f2)) System.out.println("[ok] 1/2 != 1/3");
		else System.out.println("[echec] 1/2 == 1/3!!!!: ");

		f = new Fraction(1, -2);
		f2 = new Fraction(-1, 2);
		if (f.egaleA(f2)) System.out.println("[ok] 1/-2 == -1/2");
		else System.out.println("[echec] 1/-2 != -1/2!!!!: ");
		if (f2.egaleA(f)) System.out.println("[ok] -1/2== 1/-2");
		else System.out.println("[echec] -1/2!= 1/-2!!!!: ");

		f = new Fraction(1, 2);
		f2 = new Fraction(1, 2);
		if (f.egaleA(f2)) System.out.println("[ok] 1/2 == 1/2");
		else System.out.println("[echec] 1/2 != 1/2!!!!: ");
		if (f2.egaleA(f)) System.out.println("[ok] 1/2== 1/2");
		else System.out.println("[echec] 1/2 != 1/2!!!!: ");		

		System.out.println();

		// Tests ajoute
		System.out.println("Tests ajoute");
		f = new Fraction(1, 2);
		f2 = new Fraction(3, 2);
		f.ajoute(f2);
		if(f.getNum()==2 && f.getDen()==1) System.out.println("[ok] 1/2 + 3/2 == 2/1");
		else System.out.println("[echec] 1/2 + 3/2 == 2/1, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(10, 2);
		f2 = new Fraction(5, 4);
		f.ajoute(f2);
		if(f.getNum()==25 && f.getDen()==4) System.out.println("[ok] 10/2 + 5/4 == 25/4");
		else System.out.println("[echec] 10/2 + 5/4 == 25/4, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(-1, 2);
		f.ajoute(f2);
		if(f.getNum()==0 && f.getDen()==1) System.out.println("[ok] 1/2 + -1/2 == 0/1");
		else System.out.println("[echec] 1/2 + -1/2 == 0/1, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(-1, 2);
		f2.ajoute(f);
		if(f2.getNum()==0 && f2.getDen()==1) System.out.println("[ok] -1/2 + 1/2 == 0/1");
		else System.out.println("[echec] -1/2 + -1/2 == 0/1, on trouve : "+String.valueOf(f2.getNum())+"/"+String.valueOf(f2.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(1, -2);
		f.ajoute(f2);
		if(f.getNum()==0 && f.getDen()==1) System.out.println("[ok] 1/2 + 1/-2 == 0/1");
		else System.out.println("[echec] 1/2 + 1-/2 == 0/1, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		System.out.println();

		// Tests soustrait
		System.out.println("Tests soustrait");
		f = new Fraction(1, 2);
		f2 = new Fraction(3, 2);
		f2.soustrait(f);
		if(f2.getNum()==1 && f2.getDen()==1) System.out.println("[ok] 3/2 - 1/2 == 1/1");
		else System.out.println("[echec] 3/2 - 1/2 == 1/1, on trouve : "+String.valueOf(f2.getNum())+"/"+String.valueOf(f2.getDen()));

		f = new Fraction(10, 2);
		f2 = new Fraction(5, 4);
		f.soustrait(f2);
		if(f.getNum()==15 && f.getDen()==4) System.out.println("[ok] 10/2 - 5/4 == 15/4");
		else System.out.println("[echec] 10/2 - 5/4 == 15/4, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(-1, 2);
		f.soustrait(f2);
		if(f.getNum()==1 && f.getDen()==1) System.out.println("[ok] 1/2 - -1/2 == 1/1");
		else System.out.println("[echec] 1/2 - -1/2 == 1/1, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(-1, 2);
		f2.soustrait(f);
		if(f2.getNum()==-1 && f2.getDen()==1) System.out.println("[ok] -1/2 - 1/2 == -1/1");
		else System.out.println("[echec] -1/2 - 1/2 == -1/1, on trouve : "+String.valueOf(f2.getNum())+"/"+String.valueOf(f2.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(1, -2);
		f.soustrait(f2);
		if(f.getNum()==1 && f.getDen()==1) System.out.println("[ok] 1/2 - 1/-2 == 1/1");
		else System.out.println("[echec] 1/2 - 1/-2 == 1/1, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		System.out.println();
		
		// Tests multiplie
		System.out.println("Tests multiplie");
		f = new Fraction(1, 2);
		f2 = new Fraction(3, 2);
		f.multiplie(f2);
		if(f.getNum()==3 && f.getDen()==4) System.out.println("[ok] 1/2 * 3/2 == 3/4");
		else System.out.println("[echec] 1/2 * 3/2 == 3/4, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(10, 2);
		f2 = new Fraction(5, 4);
		f.multiplie(f2);
		if(f.getNum()==25 && f.getDen()==4) System.out.println("[ok] 10/2 * 5/4 == 25/4");
		else System.out.println("[echec] 10/2 * 5/4 == 25/4, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(-1, 2);
		f.multiplie(f2);
		if(f.getNum()==-1 && f.getDen()==4) System.out.println("[ok] 1/2 * -1/2 == -1/4");
		else System.out.println("[echec] 1/2 * -1/2 == -1/4, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(-1, 2);
		f2.multiplie(f);
		if(f2.getNum()==-1 && f2.getDen()==4) System.out.println("[ok] -1/2 * 1/2 == -1/4");
		else System.out.println("[echec] -1/2 * 1/2 == -1/4, on trouve : "+String.valueOf(f2.getNum())+"/"+String.valueOf(f2.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(1, -2);
		f.multiplie(f2);
		if(f.getNum()==-1 && f.getDen()==4) System.out.println("[ok] 1/2 * 1/-2 == -1/4");
		else System.out.println("[echec] 1/2 * 1/-2 == -1/4, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));
		
		System.out.println();		

		// Tests divise
		System.out.println("Tests divise");
		f = new Fraction(1, 2);
		f2 = new Fraction(3, 2);
		f.divise(f2);
		if(f.getNum()==1 && f.getDen()==3) System.out.println("[ok] 1/2 / 3/2 == 1/3");
		else System.out.println("[echec] 1/2 / 3/2 == 1/3, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(10, 2);
		f2 = new Fraction(5, 4);
		f.divise(f2);
		if(f.getNum()==4 && f.getDen()==1) System.out.println("[ok] 10/2 / 5/4 == 4/1");
		else System.out.println("[echec] 10/2 / 5/4 == 4/1, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(-1, 2);
		f.divise(f2);
		if(f.getNum()==-1 && f.getDen()==1) System.out.println("[ok] 1/2 / -1/2 == -1/1");
		else System.out.println("[echec] 1/2 / -1/2 == -1/1, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(-1, 2);
		f2.divise(f);
		if(f2.getNum()==-1 && f2.getDen()==1) System.out.println("[ok] -1/2 / 1/2 == -1/1");
		else System.out.println("[echec] -1/2 / 1/2 == -1/1, on trouve : "+String.valueOf(f2.getNum())+"/"+String.valueOf(f2.getDen()));

		f = new Fraction(1, 2);
		f2 = new Fraction(1, -2);
		f.divise(f2);
		if(f.getNum()==-1 && f.getDen()==1) System.out.println("[ok] 1/2 / 1/-2 == -1/1");
		else System.out.println("[echec] 1/2 / 1/-2 == -1/1, on trouve : "+String.valueOf(f.getNum())+"/"+String.valueOf(f.getDen()));
		
		System.out.println();

	}

}

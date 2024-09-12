package packageFraction;

public class Fraction {
	
	private int num;
	private int den;
	
	/* CONSTRUCTOR */
	public Fraction(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être égal à 0.");
        }
		this.num = num;
		this.den = den;
	}

	/* GETTER */
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}
	
	/* SETTER */
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setDen(int den) {
		if (den != 0) {
			this.den = den;
		}
		
	}
	
	/* METHODES */
	public void afficheFraction() {
		System.out.println(this.num + "/" + this.den);
	}
	
    public static int pgcd(int a, int b) {
        /**
         * Calcule le PGCD de deux entiers
         * @param a un des deux entiers
         * @param b un des deux entiers
         * @return le PGCD des deux entiers
         */
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	
	public boolean egaleA(Fraction f) {
		/**
		* Test si la Fraction est egale a une autre Fraction
		* @param f Fraction a comparer
		* @return vrai si les deux Fractions sont egales
		*/ 
		return this.num * f.getDen() == f.getNum() * this.den;
	}

	public void ajoute(Fraction f) {
		/**
		* Ajoute une Fraction a la Fraction
		* @param Fraction a ajouter
		*/ 
		if (f.den == this.den) {
			this.num += f.num;
		} else {
			this.num = this.den * f.num + this.num * f.den;
			this.den *= f.den;
		}
		reduire();
	}
		
	public void reduire() {
		/**
		* Reduit/Simplifie la Fraction
		*/
		int pgcd = pgcd(this.den,this.num);
		this.den /= pgcd;
		this.num /= pgcd;	
		
		if (this.den < 0 ) {
			this.den *= (-1);
			this.num *= (-1);
		}
	}
	
	public void inverse() {
		/**
		* Inverse la Fraction<br>
		* Le signe est au numerateur.
		*/
		
		if (this.num !=0) {
			int tempNum = this.num;
			this.num = this.den;
			this.den = tempNum;
		}
	}
	
	public void multiplierParCoeff(int i) {
		/**
		* Multiplie la Fraction par un Coefficient
		* @param i Coefficient multiplicateur
		*/
		this.num *= i;
	}
	
	public void multiplie(Fraction f) {
		
		this.num *= f.num;
		this.den *= f.den;
		
		reduire();
	}
	
	public void soustrait(Fraction f) {
	    int tempDen = this.den * f.getDen();
	    int tempNum = this.num * f.getDen() - f.getNum() * this.den;
	    this.num = tempNum;
	    this.den = tempDen;
	    reduire();
	}
	
	public void divise(Fraction f) {
		this.num *= f.den;
		this.den *= f.num;
		reduire();
	}
	
}



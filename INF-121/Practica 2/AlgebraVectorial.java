class AlgebraVectorial {
    private double x, y, z;

    // Constructor
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Suma de vectores
    public AlgebraVectorial suma(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    // Resta de vectores
    public AlgebraVectorial resta(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    // Producto escalar
    public double productoEscalar(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    // Producto vectorial
    public AlgebraVectorial productoVectorial(AlgebraVectorial v) {
        return new AlgebraVectorial(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }

    // Longitud
    public double longitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    // Verifica perpendicularidad
    public boolean esPerpendicular(AlgebraVectorial v) {
        return this.productoEscalar(v) == 0;
    }

    // Verifica paralelismo
    public boolean esParalelo(AlgebraVectorial v) {
        AlgebraVectorial cruz = this.productoVectorial(v);
        return cruz.x == 0 && cruz.y == 0 && cruz.z == 0;
    }

    // Proyección de this sobre v
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial v) {
        double escalar = this.productoEscalar(v) / Math.pow(v.longitud(), 2);
        return new AlgebraVectorial(escalar * v.x, escalar * v.y, escalar * v.z);
    }

    // Componente de this en dirección de v
    public double componenteEn(AlgebraVectorial v) {
        return this.productoEscalar(v) / v.longitud();
    }

    // Mostrar vector
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    // Main para pruebas
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(1, 2, 3);
        AlgebraVectorial b = new AlgebraVectorial(2, 4, 6);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("¿Perpendicular? " + a.esPerpendicular(b));
        System.out.println("¿Paralelo? " + a.esParalelo(b));
        System.out.println("Proyección de a sobre b: " + a.proyeccionSobre(b));
        System.out.println("Componente de a en b: " + a.componenteEn(b));
    }
}

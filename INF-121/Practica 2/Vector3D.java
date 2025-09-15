class Vector3D {
    private double x, y, z;

    // Constructor
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Suma de vectores
    public Vector3D suma(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    // Multiplicación por escalar
    public Vector3D escalar(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }

    // Longitud
    public double longitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    // Normalización
    public Vector3D normalizar() {
        double l = this.longitud();
        return new Vector3D(this.x / l, this.y / l, this.z / l);
    }

    // Producto escalar
    public double productoEscalar(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    // Producto vectorial
    public Vector3D productoVectorial(Vector3D v) {
        return new Vector3D(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }

    // Mostrar vector
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    // Main de prueba
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Suma: " + a.suma(b));
        System.out.println("Escalar 2*a: " + a.escalar(2));
        System.out.println("Longitud de a: " + a.longitud());
        System.out.println("Normal de a: " + a.normalizar());
        System.out.println("Producto escalar: " + a.productoEscalar(b));
        System.out.println("Producto vectorial: " + a.productoVectorial(b));
    }
}

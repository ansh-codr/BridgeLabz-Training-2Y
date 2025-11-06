package FunctionalInterface.MarkerInterfaces.CloningPrototypeObjects;

class thing implements Cloneable {
    int x;
    thing(int x) { this.x = x; }
    thing copy() {
        try { return (thing) super.clone(); } catch (Exception e) { return null; }
    }
}

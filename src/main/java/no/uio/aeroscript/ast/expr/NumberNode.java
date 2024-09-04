package no.uio.aeroscript.ast.expr;
// Hva skjer her???
public class NumberNode extends Node {
    private final float value;
    
    public NumberNode(float f) {
        this.value = f;
    }
    
    @Override
    public Object evaluate() {
        return value;
    }
}


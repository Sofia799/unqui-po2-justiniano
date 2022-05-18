package ar.edu.unq.po2.tp8;

public class ShapeShifterPrueba {

	public static void main(String[] args) {
		IShapeShifter shapeShifterComposite = new ShapeShifterComposite();
		IShapeShifter shapeShifterLeaf = new ShapeShifterLeaf(1);
		IShapeShifter shapeShifterLeaf2 = new ShapeShifterLeaf(2);
		
		IShapeShifter resultado = shapeShifterComposite.compose(shapeShifterLeaf);
		IShapeShifter resultado2 = resultado.compose(shapeShifterLeaf2);
		IShapeShifter resultado3 = resultado2.compose(shapeShifterLeaf2);
		
		System.out.println(resultado.deepest());
		
		System.out.println(resultado.values()); //1
		System.out.println(resultado2.values()); //2
		System.out.println(resultado3.values()); //3

	}

}

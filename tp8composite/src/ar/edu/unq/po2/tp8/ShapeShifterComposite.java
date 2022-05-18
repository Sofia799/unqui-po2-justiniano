package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterComposite implements IShapeShifter {

	private List<IShapeShifter> childrenShapeShifters = new ArrayList<IShapeShifter>();

	public void addShapeShifter(IShapeShifter shapeShifter) {
		this.getChildrenShapeShifters().add(shapeShifter);
	}

	public void removeShapeShifter(IShapeShifter shapeShifter) {
		this.getChildrenShapeShifters().remove(shapeShifter);
	}

	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		ShapeShifterComposite shapeShifterNuevo = new ShapeShifterComposite();
		shapeShifterNuevo.addShapeShifter(shapeShifter);
		shapeShifterNuevo.addShapeShifter(this);
		return shapeShifterNuevo;
	}

	@Override
	public Integer deepest() {
		Integer nroComposicionesMaximas = 0;
		Integer nroComposicionesInicial = 1;
		// en un shapeshifter compuesto cuenta inicialmente como 1 composicion
		for (int i = 0; i < this.getChildrenShapeShifters().size(); i++) {
			nroComposicionesMaximas = Math.max(getChildrenShapeShifters().get(i).deepest(), nroComposicionesMaximas);
		}
		return nroComposicionesInicial + nroComposicionesMaximas;
	}

	@Override
	public IShapeShifter flat() {
		return null;
	}

	@Override
	public List<Integer> values() {
		List<Integer> valoresEnElShapeShifter = new ArrayList<Integer>();
		for (int i = 0; i < this.getChildrenShapeShifters().size(); i++) {
			IShapeShifter shapeShifter = this.getChildrenShapeShifters().get(i);
			valoresEnElShapeShifter.addAll(shapeShifter.values());
		}

		return valoresEnElShapeShifter;
	}

	public List<IShapeShifter> getChildrenShapeShifters() {
		return childrenShapeShifters;
	}

}

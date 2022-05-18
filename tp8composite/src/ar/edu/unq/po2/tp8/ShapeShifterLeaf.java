package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter{
	
	private Integer value;

	public ShapeShifterLeaf(Integer value) {
		this.value = value;
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
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(value);
		return values;
	}

}

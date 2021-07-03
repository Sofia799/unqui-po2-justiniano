package ar.edu.unq.po2tpComposite;

import java.util.List;

public interface IShapeShifte {

	public IShapeShifte compose(IShapeShifte shapeShifte);

	public int deepest();

	public IShapeShifte flat();

	public List<Integer> values();

}

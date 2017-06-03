
/**
 * The <code>Math</code> class represents mathematically equations.
 * All equations are formulas that are not changed, such as a^2 + b^2 = c ^ 2,
 * are implemented as methods of this class.
 * @author Sorath- 14SW83
 * @since JDK1.8
 */

public class Math {
	/** These values are used for equation variable storage. */
	private float aSqrt;
	private float bSqrt;
	private float cSqry;

	 /**
     * Uses the param values as a and b of pythagorean theorem to calculate the value of c^2.
     * This method doesn't perform any range checking.
     * Both params are used to calculate respected square and then summed to find c^2
     * @param      a     The first value to put into the theorem formula.
     * @param      b     The second value to put into the theorem formula.
     */
	public float pythagorean(float a, float b) {
		this.aSqrt = a*a;
		this.bSqrt = b*b;
		this.cSqrt = this.aSqrt + this.bSqrt;
		return this.cSqrt
	}
}
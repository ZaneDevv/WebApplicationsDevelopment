/**
 * This class is a RNG (Random Number Generator).
 *
 * @version 2.1
 * @date 25/11/17
 * @author Álvaro Fernández Barrero
 */

public class RNG
{
	public double seed = 0;
	
	
	/**
	 * @brief Creates a new random number generator whose seed is 0.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public RNG()
	{
		this.seed = 0;
	}
	
	
	/**
	 * @brief Creates a new random number generator with the given seed.
	 * @param seed The seed for this generator.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public RNG(double seed)
	{
		this.seed = seed;
	}
	
	
	/**
	 * @brief Creates a new random number generator with the seed of the given RNG.
	 * @param rng The RNG to obtain the seed.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public RNG(RNG rng)
	{
		this.seed = rng.seed;
	}
	
	
	/**
	 * @brief Generates a new random integer with the given limits.
	 * @param min The minimum integer to obtain.
	 * @param max The maximum integer to obtain.
	 * @return A random integer within the two given limits.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public byte nextByte(byte min, byte max)
	{
		return (byte)this.nextNumber((double)min, (double)max + 1);
	}
	
	
	/**
	 * @brief Generates a new random integer with the given limits.
	 * @param min The minimum integer to obtain.
	 * @param max The maximum integer to obtain.
	 * @return A random integer within the two given limits.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public short nextShort(short min, short max)
	{
		return (short)this.nextNumber((double)min, (double)max + 1);
	}
	
	
	/**
	 * @brief Generates a new random integer with the given limits.
	 * @param min The minimum integer to obtain.
	 * @param max The maximum integer to obtain.
	 * @return A random integer within the two given limits.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public int nextInt(int min, int max)
	{
		return (int)this.nextNumber((double)min, (double)max + 1);
	}
	
	
	/**
	 * @brief Generates a new random integer with the given limits.
	 * @param min The minimum integer to obtain.
	 * @param max The maximum integer to obtain.
	 * @return A random integer within the two given limits.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public long nextLong(long min, long max)
	{
		return (long)this.nextNumber((double)min, (double)max + 1);
	}
	
	
	/**
	 * @brief Generates a new random integer with the given limits.
	 * @param min The minimum real number to obtain.
	 * @param max The maximum real number to obtain.
	 * @return A random integer within the two given limits.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public float nextFloat(float min, float max)
	{
		return (float)this.nextNumber((double)min, (double)max);
	}
	
	
	/**
	 * @brief Generates a new random real number with the given limits.
	 * @param min The minimum real number to obtain.
	 * @param max The maximum real number to obtain.
	 * @return A random integer within the two given limits.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public double nextDouble(double min, double max)
	{
		return this.nextNumber(min, max);
	}
	
	
	/**
	 * @brief Generates a random boolean.
	 * @return A random boolean.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	public boolean nextBoolean()
	{
		return this.nextNumber() > 0.5;
	}
	
	
	/**
	 * @brief Computes the next number in the sequence of this RNG with the given limits.
	 * @param min The maximum number to obtain,
	 * @param max The maximum number to obtain.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private double nextNumber(double min, double max)
	{
		return min + this.nextNumber() * (max - min);
	}
	
	
	/**
	 * @brief Computes the next number in the sequence of this RNG.
	 * @return The next number in the pseudo-random sequence.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private double nextNumber()
	{
		this.nextSeed();
		return this.seed / 20;
	}
	
	
	/**
	 * @brief Computes the next seed.
	 * @date 25/11/17
	 * @author Álvaro Fernández Barrero
	 */
	private void nextSeed()
	{
		this.seed = (234.4395464 * this.seed + 0xfa) % 20;
	}
}
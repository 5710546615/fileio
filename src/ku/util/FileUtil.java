package ku.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * FileUtil is a class for copying the inputstream to the outputstream.
 * 
 * @author Visurt Anuttivong
 * @version 5710546615
 *
 */

public class FileUtil {

	/**
	 * Copying the inputstream to the outputstream one byte at a time.
	 * 
	 * @param in
	 *            is the file which we want to copy.
	 * @param out
	 *            is the file which is copy's destination.
	 */
	static void copy(InputStream in, OutputStream out) {
		copy(in, out, 1);
	}

	/**
	 * Copying the inputstream to the outputstream using a byte array of size
	 * blocksize.
	 * 
	 * @param in
	 *            is the file which we want to copy.
	 * @param out
	 *            is the file which is copy's destination.
	 * @param blocksize
	 *            is the size of array.
	 */
	static void copy(InputStream in, OutputStream out, int blocksize) {
		try {
			int n;
			byte[] buffer = new byte[blocksize];
			while ((n = in.read(buffer)) > -1) {
				out.write(buffer, 0, n);
			}
			in.close();
			out.close();
		} catch (RuntimeException r) {
			throw new RuntimeException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Copying the inputstream to the outputstream using a BufferedReader and
	 * PrintWriter.
	 * 
	 * @param in
	 *            is the file which we want to copy.
	 * @param out
	 *            is the file which is copy's destination.
	 */
	static void bcopy(InputStream in, OutputStream out) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			PrintWriter pw = new PrintWriter(out);
			String s;
			while ((s = br.readLine()) != null) {
				pw.write(s + "\n");
			}
			br.close();
			pw.close();
		} catch (RuntimeException r) {
			throw new RuntimeException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

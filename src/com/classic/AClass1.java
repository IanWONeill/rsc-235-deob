package com.classic;

import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;

abstract class AClass1 {
	
	static int anInt320;
	static int[] anIntArray81;
	int maybe_port;
	static BigInteger aBigInteger1 = new BigInteger("10001", 16);
	String maybe_host;

	abstract Socket method174(boolean bool) throws IOException;

	Socket method175(final boolean bool) throws IOException {
		if (bool != true) {
			method176((byte) 122);
		}
		return new Socket(this.maybe_host, this.maybe_port);
	}

	static int method176(final byte i) {
		int i_0_ = StreamClass.method381(Class25.anInt302, Class52.aByteArray20, (byte) 120);
		if (i_0_ > 99999999) {
			i_0_ = 99999999 - i_0_;
		}
		Class25.anInt302 += 4;
		if (i != -123) {
			method176((byte) 47);
		}
		return i_0_;
	}
}

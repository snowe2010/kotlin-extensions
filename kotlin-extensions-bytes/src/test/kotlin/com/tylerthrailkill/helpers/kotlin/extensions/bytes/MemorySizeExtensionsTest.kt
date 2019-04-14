package com.tylerthrailkill.helpers.kotlin.extensions.bytes

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

object MemorySizeExtensionsTest : Spek({
    describe("getMemoryUsage should return something") {
        assertNotNull(getMemoryUsage().first)
        assertNotNull(getMemoryUsage().second)
    }
    describe("Longs") {
        val long = Long.MAX_VALUE
        val inBits = BitValue(long)
        val inBytes = inBits * 8
        val inKibibytes = inBytes * 1024
        val inKilobytes = inBytes * 1000
        val inMebibytes = inKibibytes * 1024
        val inMegabytes = inKilobytes * 1000
        val inGibibytes = inMebibytes * 1024
        val inGigabytes = inMegabytes * 1000
        val inTebibytes = inGibibytes * 1024
        val inTerabytes = inGigabytes * 1000
        val inPebibytes = inTebibytes * 1024
        val inPetabytes = inTerabytes * 1000
        context("bits") {
            it("Long.bits") {
                assertEquals(inBits, long.bits)
            }
            it("Long.bit") {
                assertEquals(inBits, long.bit)
            }
        }
        context("bytes") {
            it("Long.bytes") {
                assertEquals(inBytes, long.bytes)
            }
            it("Long.byte") {
                assertEquals(inBytes, long.byte)
            }
            it("Long.B") {
                assertEquals(inBytes, long.B)
            }
        }
        context("kibibytes") {
            it("Long.kibibytes") {
                assertEquals(inKibibytes, long.kibibytes)
            }
            it("Long.kibibyte") {
                assertEquals(inKibibytes, long.kibibyte)
            }
            it("Long.KiB") {
                assertEquals(inKibibytes, long.KiB)
            }
        }
        context("kilobytes") {
            it("Long.kilobytes") {
                assertEquals(inKilobytes, long.kilobytes)
            }
            it("Long.kilobyte") {
                assertEquals(inKilobytes, long.kilobyte)
            }
            it("Long.KB") {
                assertEquals(inKilobytes, long.KB)
            }
        }
        context("mebibytes") {
            it("Long.mebibytes") {
                assertEquals(inMebibytes, long.mebibytes)
            }
            it("Long.mebibyte") {
                assertEquals(inMebibytes, long.mebibyte)
            }
            it("Long.MiB") {
                assertEquals(inMebibytes, long.MiB)
            }
        }
        context("megabytes") {
            it("Long.megabytes") {
                assertEquals(inMegabytes, long.megabytes)
            }
            it("Long.megabyte") {
                assertEquals(inMegabytes, long.megabyte)
            }
            it("Long.MB") {
                assertEquals(inMegabytes, long.MB)
            }
        }
        context("gibibytes") {
            it("Long.gibibytes") {
                assertEquals(inGibibytes, long.gibibytes)
            }
            it("Long.gibibyte") {
                assertEquals(inGibibytes, long.gibibyte)
            }
            it("Long.GiB") {
                assertEquals(inGibibytes, long.GiB)
            }
        }
        context("gigabytes") {
            it("Long.gigabytes") {
                assertEquals(inGigabytes, long.gigabytes)
            }
            it("Long.gigabyte") {
                assertEquals(inGigabytes, long.gigabyte)
            }
            it("Long.GB") {
                assertEquals(inGigabytes, long.GB)
            }
        }
        context("tebibytes") {
            it("Long.tebibytes") {
                assertEquals(inTebibytes, long.tebibytes)
            }
            it("Long.tebibyte") {
                assertEquals(inTebibytes, long.tebibyte)
            }
            it("Long.TiB") {
                assertEquals(inTebibytes, long.TiB)
            }
        }
        context("terabytes") {
            it("Long.terabytes") {
                assertEquals(inTerabytes, long.terabytes)
            }
            it("Long.terabyte") {
                assertEquals(inTerabytes, long.terabyte)
            }
            it("Long.TB") {
                assertEquals(inTerabytes, long.TB)
            }
        }
        context("pebibytes") {
            it("Long.pebibytes") {
                assertEquals(inPebibytes, long.pebibytes)
            }
            it("Long.pebibyte") {
                assertEquals(inPebibytes, long.pebibyte)
            }
            it("Long.PiB") {
                assertEquals(inPebibytes, long.PiB)
            }
        }
        context("petabytes") {
            it("Long.petabytes") {
                assertEquals(inPetabytes, long.petabytes)
            }
            it("Long.petabyte") {
                assertEquals(inPetabytes, long.petabyte)
            }
            it("Long.PB") {
                assertEquals(inPetabytes, long.PB)
            }
        }
    }
    describe("Ints") {
        val int = Int.MAX_VALUE
        val inBits = BitValue(int.toLong())
        val inBytes = inBits.times(8)
        val inKibibytes = inBytes.times(1024)
        val inKilobytes = inBytes.times(1000)
        val inMebibytes = inKibibytes.times(1024)
        val inMegabytes = inKilobytes.times(1000)
        val inGibibytes = inMebibytes.times(1024)
        val inGigabytes = inMegabytes.times(1000)
        val inTebibytes = inGibibytes.times(1024)
        val inTerabytes = inGigabytes.times(1000)
        val inPebibytes = inTebibytes.times(1024)
        val inPetabytes = inTerabytes.times(1000)
        context("bits") {
            it("Int.bits") {
                assertEquals(inBits, int.bits)
            }
            it("Int.bit") {
                assertEquals(inBits, int.bit)
            }
        }
        context("bytes") {
            it("Int.bytes") {
                assertEquals(inBytes, int.bytes)
            }
            it("Int.byte") {
                assertEquals(inBytes, int.byte)
            }
            it("Int.B") {
                assertEquals(inBytes, int.B)
            }
        }
        context("kibibytes") {
            it("Int.kibibytes") {
                assertEquals(inKibibytes, int.kibibytes)
            }
            it("Int.kibibyte") {
                assertEquals(inKibibytes, int.kibibyte)
            }
            it("Int.KiB") {
                assertEquals(inKibibytes, int.KiB)
            }
        }
        context("kilobytes") {
            it("Int.kilobytes") {
                assertEquals(inKilobytes, int.kilobytes)
            }
            it("Int.kilobyte") {
                assertEquals(inKilobytes, int.kilobyte)
            }
            it("Int.KB") {
                assertEquals(inKilobytes, int.KB)
            }
        }
        context("mebibytes") {
            it("Int.mebibytes") {
                assertEquals(inMebibytes, int.mebibytes)
            }
            it("Int.mebibyte") {
                assertEquals(inMebibytes, int.mebibyte)
            }
            it("Int.MiB") {
                assertEquals(inMebibytes, int.MiB)
            }
        }
        context("megabytes") {
            it("Int.megabytes") {
                assertEquals(inMegabytes, int.megabytes)
            }
            it("Int.megabyte") {
                assertEquals(inMegabytes, int.megabyte)
            }
            it("Int.MB") {
                assertEquals(inMegabytes, int.MB)
            }
        }
        context("gibibytes") {
            it("Int.gibibytes") {
                assertEquals(inGibibytes, int.gibibytes)
            }
            it("Int.gibibyte") {
                assertEquals(inGibibytes, int.gibibyte)
            }
            it("Int.GiB") {
                assertEquals(inGibibytes, int.GiB)
            }
        }
        context("gigabytes") {
            it("Int.gigabytes") {
                assertEquals(inGigabytes, int.gigabytes)
            }
            it("Int.gigabyte") {
                assertEquals(inGigabytes, int.gigabyte)
            }
            it("Int.GB") {
                assertEquals(inGigabytes, int.GB)
            }
        }
        context("tebibytes") {
            it("Int.tebibytes") {
                assertEquals(inTebibytes, int.tebibytes)
            }
            it("Int.tebibyte") {
                assertEquals(inTebibytes, int.tebibyte)
            }
            it("Int.TiB") {
                assertEquals(inTebibytes, int.TiB)
            }
        }
        context("terabytes") {
            it("Int.terabytes") {
                assertEquals(inTerabytes, int.terabytes)
            }
            it("Int.terabyte") {
                assertEquals(inTerabytes, int.terabyte)
            }
            it("Int.TB") {
                assertEquals(inTerabytes, int.TB)
            }
        }
        context("pebibytes") {
            it("Int.pebibytes") {
                assertEquals(inPebibytes, int.pebibytes)
            }
            it("Int.pebibyte") {
                assertEquals(inPebibytes, int.pebibyte)
            }
            it("Int.PiB") {
                assertEquals(inPebibytes, int.PiB)
            }
        }
        context("petabytes") {
            it("Int.petabytes") {
                assertEquals(inPetabytes, int.petabytes)
            }
            it("Int.petabyte") {
                assertEquals(inPetabytes, int.petabyte)
            }
            it("Int.PB") {
                assertEquals(inPetabytes, int.PB)
            }
        }
    }
    describe("BitValue") {
        it("toBytes") {
//            assertEquals(1, BitValue(8L).toBytes)
        }
    }
})

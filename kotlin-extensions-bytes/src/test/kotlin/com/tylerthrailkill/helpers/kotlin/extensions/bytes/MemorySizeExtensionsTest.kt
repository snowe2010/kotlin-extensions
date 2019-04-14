package com.tylerthrailkill.helpers.kotlin.extensions.bytes

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

object MemorySizeExtensionsTest : Spek({
    val bit = 1L
    val byte = 8L
    val kibibyte = 1024L*8L
    val kilobyte = 1000L*8L
    val mebibyte = 1024L*1024L*8L
    val megabyte = 1000L*1000L*8L
    val gibibyte = 1024L*1024L*1024L*8L
    val gigabyte = 1000L*1000L*1000L*8L
    val tebibyte = 1024L*1024L*1024L*1024L*8L
    val terabyte = 1000L*1000L*1000L*1000L*8L
    val pebibyte = 1024L*1024L*1024L*1024L*1024L*8L
    val petabyte = 1000L*1000L*1000L*1000L*1000L*8L
    
    describe("getMemoryUsage should return something") {
        assertNotNull(getMemoryUsage().first)
        assertNotNull(getMemoryUsage().second)
    }
    describe("Longs") {
        val long = 1L
        context("bits") {
            it("Long.bits") {
                assertEquals(BitValue(bit*long), long.bits)
            }
            it("Long.bit") {
                assertEquals(BitValue(bit*long), long.bit)
            }
        }
        context("bytes") {
            it("Long.bytes") {
                assertEquals(BitValue(byte*long), long.bytes)
            }
            it("Long.byte") {
                assertEquals(BitValue(byte*long), long.byte)
            }
            it("Long.B") {
                assertEquals(BitValue(byte*long), long.B)
            }
        }
        context("kibibytes") {
            it("Long.kibibytes") {
                assertEquals(BitValue(kibibyte*long), long.kibibytes)
            }
            it("Long.kibibyte") {
                assertEquals(BitValue(kibibyte*long), long.kibibyte)
            }
            it("Long.KiB") {
                assertEquals(BitValue(kibibyte*long), long.KiB)
            }
        }
        context("kilobytes") {
            it("Long.kilobytes") {
                assertEquals(BitValue(kilobyte*long), long.kilobytes)
            }
            it("Long.kilobyte") {
                assertEquals(BitValue(kilobyte*long), long.kilobyte)
            }
            it("Long.KB") {
                assertEquals(BitValue(kilobyte*long), long.KB)
            }
        }
        context("mebibytes") {
            it("Long.mebibytes") {
                assertEquals(BitValue(mebibyte*long), long.mebibytes)
            }
            it("Long.mebibyte") {
                assertEquals(BitValue(mebibyte*long), long.mebibyte)
            }
            it("Long.MiB") {
                assertEquals(BitValue(mebibyte*long), long.MiB)
            }
        }
        context("megabytes") {
            it("Long.megabytes") {
                assertEquals(BitValue(megabyte*long), long.megabytes)
            }
            it("Long.megabyte") {
                assertEquals(BitValue(megabyte*long), long.megabyte)
            }
            it("Long.MB") {
                assertEquals(BitValue(megabyte*long), long.MB)
            }
        }
        context("gibibytes") {
            it("Long.gibibytes") {
                assertEquals(BitValue(gibibyte*long), long.gibibytes)
            }
            it("Long.gibibyte") {
                assertEquals(BitValue(gibibyte*long), long.gibibyte)
            }
            it("Long.GiB") {
                assertEquals(BitValue(gibibyte*long), long.GiB)
            }
        }
        context("gigabytes") {
            it("Long.gigabytes") {
                assertEquals(BitValue(gigabyte*long), long.gigabytes)
            }
            it("Long.gigabyte") {
                assertEquals(BitValue(gigabyte*long), long.gigabyte)
            }
            it("Long.GB") {
                assertEquals(BitValue(gigabyte*long), long.GB)
            }
        }
        context("tebibytes") {
            it("Long.tebibytes") {
                assertEquals(BitValue(tebibyte*long), long.tebibytes)
            }
            it("Long.tebibyte") {
                assertEquals(BitValue(tebibyte*long), long.tebibyte)
            }
            it("Long.TiB") {
                assertEquals(BitValue(tebibyte*long), long.TiB)
            }
        }
        context("terabytes") {
            it("Long.terabytes") {
                assertEquals(BitValue(terabyte*long), long.terabytes)
            }
            it("Long.terabyte") {
                assertEquals(BitValue(terabyte*long), long.terabyte)
            }
            it("Long.TB") {
                assertEquals(BitValue(terabyte*long), long.TB)
            }
        }
        context("pebibytes") {
            it("Long.pebibytes") {
                assertEquals(BitValue(pebibyte*long), long.pebibytes)
            }
            it("Long.pebibyte") {
                assertEquals(BitValue(pebibyte*long), long.pebibyte)
            }
            it("Long.PiB") {
                assertEquals(BitValue(pebibyte*long), long.PiB)
            }
        }
        context("petabytes") {
            it("Long.petabytes") {
                assertEquals(BitValue(petabyte*long), long.petabytes)
            }
            it("Long.petabyte") {
                assertEquals(BitValue(petabyte*long), long.petabyte)
            }
            it("Long.PB") {
                assertEquals(BitValue(petabyte*long), long.PB)
            }
        }
    }
    describe("Ints") {
        val int = 1
        context("bits") {
            it("Int.bits") {
                assertEquals(BitValue(bit*int), int.bits)
            }
            it("Int.bit") {
                assertEquals(BitValue(bit*int), int.bit)
            }
        }
        context("bytes") {
            it("Int.bytes") {
                assertEquals(BitValue(byte*int), int.bytes)
            }
            it("Int.byte") {
                assertEquals(BitValue(byte*int), int.byte)
            }
            it("Int.B") {
                assertEquals(BitValue(byte*int), int.B)
            }
        }
        context("kibibytes") {
            it("Int.kibibytes") {
                assertEquals(BitValue(kibibyte*int), int.kibibytes)
            }
            it("Int.kibibyte") {
                assertEquals(BitValue(kibibyte*int), int.kibibyte)
            }
            it("Int.KiB") {
                assertEquals(BitValue(kibibyte*int), int.KiB)
            }
        }
        context("kilobytes") {
            it("Int.kilobytes") {
                assertEquals(BitValue(kilobyte*int), int.kilobytes)
            }
            it("Int.kilobyte") {
                assertEquals(BitValue(kilobyte*int), int.kilobyte)
            }
            it("Int.KB") {
                assertEquals(BitValue(kilobyte*int), int.KB)
            }
        }
        context("mebibytes") {
            it("Int.mebibytes") {
                assertEquals(BitValue(mebibyte*int), int.mebibytes)
            }
            it("Int.mebibyte") {
                assertEquals(BitValue(mebibyte*int), int.mebibyte)
            }
            it("Int.MiB") {
                assertEquals(BitValue(mebibyte*int), int.MiB)
            }
        }
        context("megabytes") {
            it("Int.megabytes") {
                assertEquals(BitValue(megabyte*int), int.megabytes)
            }
            it("Int.megabyte") {
                assertEquals(BitValue(megabyte*int), int.megabyte)
            }
            it("Int.MB") {
                assertEquals(BitValue(megabyte*int), int.MB)
            }
        }
        context("gibibytes") {
            it("Int.gibibytes") {
                assertEquals(BitValue(gibibyte*int), int.gibibytes)
            }
            it("Int.gibibyte") {
                assertEquals(BitValue(gibibyte*int), int.gibibyte)
            }
            it("Int.GiB") {
                assertEquals(BitValue(gibibyte*int), int.GiB)
            }
        }
        context("gigabytes") {
            it("Int.gigabytes") {
                assertEquals(BitValue(gigabyte*int), int.gigabytes)
            }
            it("Int.gigabyte") {
                assertEquals(BitValue(gigabyte*int), int.gigabyte)
            }
            it("Int.GB") {
                assertEquals(BitValue(gigabyte*int), int.GB)
            }
        }
        context("tebibytes") {
            it("Int.tebibytes") {
                assertEquals(BitValue(tebibyte*int), int.tebibytes)
            }
            it("Int.tebibyte") {
                assertEquals(BitValue(tebibyte*int), int.tebibyte)
            }
            it("Int.TiB") {
                assertEquals(BitValue(tebibyte*int), int.TiB)
            }
        }
        context("terabytes") {
            it("Int.terabytes") {
                assertEquals(BitValue(terabyte*int), int.terabytes)
            }
            it("Int.terabyte") {
                assertEquals(BitValue(terabyte*int), int.terabyte)
            }
            it("Int.TB") {
                assertEquals(BitValue(terabyte*int), int.TB)
            }
        }
        context("pebibytes") {
            it("Int.pebibytes") {
                assertEquals(BitValue(pebibyte*int), int.pebibytes)
            }
            it("Int.pebibyte") {
                assertEquals(BitValue(pebibyte*int), int.pebibyte)
            }
            it("Int.PiB") {
                assertEquals(BitValue(pebibyte*int), int.PiB)
            }
        }
        context("petabytes") {
            it("Int.petabytes") {
                assertEquals(BitValue(petabyte*int), int.petabytes)
            }
            it("Int.petabyte") {
                assertEquals(BitValue(petabyte*int), int.petabyte)
            }
            it("Int.PB") {
                assertEquals(BitValue(petabyte*int), int.PB)
            }
        }
    }
    describe("BitValue") {
        it("toBytes") {
            assertEquals(1, BitValue(byte).toBytes)
        }
        it("B") {
            assertEquals(1, BitValue(byte).B)
        }
        it("toKibibytes") {
            assertEquals(1, BitValue(kibibyte).toKibibytes)
        }
        it("toKilobytes") {
            assertEquals(1, BitValue(kilobyte).toKilobytes)
        }
        it("KiB") {
            assertEquals(1, BitValue(kibibyte).KiB)
        }
        it("KB") {
            assertEquals(1, BitValue(kilobyte).KB)
        }
        it("toMebibytes") {
            assertEquals(1, BitValue(mebibyte).toMebibytes)
        }
        it("toMegabytes") {
            assertEquals(1, BitValue(megabyte).toMegabytes)
        }
        it("MiB") {
            assertEquals(1, BitValue(mebibyte).MiB)
        }
        it("MB") {
            assertEquals(1, BitValue(megabyte).MB)
        }
        it("toGibibytes") {
            assertEquals(1, BitValue(gibibyte).toGibibytes)
        }
        it("toGigabytes") {
            assertEquals(1, BitValue(gigabyte).toGigabytes)
        }
        it("GiB") {
            assertEquals(1, BitValue(gibibyte).GiB)
        }
        it("GB") {
            assertEquals(1, BitValue(gigabyte).GB)
        }
        it("toTebibytes") {
            assertEquals(1, BitValue(tebibyte).toTebibytes)
        }
        it("toTerabytes") {
            assertEquals(1, BitValue(terabyte).toTerabytes)
        }
        it("TiB") {
            assertEquals(1, BitValue(tebibyte).TiB)
        }
        it("TB") {
            assertEquals(1, BitValue(terabyte).TB)
        }
        it("toPebibytes") {
            assertEquals(1, BitValue(pebibyte).toPebibytes)
        }
        it("toPetabytes") {
            assertEquals(1, BitValue(petabyte).toPetabytes)
        }
        it("PiB") {
            assertEquals(1, BitValue(pebibyte).PiB)
        }
        it("PB") {
            assertEquals(1, BitValue(petabyte).PB)
        }
        it("plus") {
            assertEquals(BitValue(1L), BitValue(0L).plus(BitValue(1L)))
        }
        it("minus") {
            assertEquals(BitValue(1L), BitValue(2L).minus(BitValue(1L)))
        }
        it("times") {
            assertEquals(BitValue(1L), BitValue(1L).times(1L))
        }
        it("div long") {
            assertEquals(BitValue(1L), BitValue(1L).div(1L))
        }
        it("div BitValue") {
            assertEquals(1L, BitValue(1L).div(BitValue(1L)))
        }
    }
})

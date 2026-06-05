package p000;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.alibaba.fastjson2.JSONB;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.ek;
import com.umeng.ccg.c;
import com.umeng.commonsdk.stateless.b;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3497Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final boolean f10857Ujhhgtgfeyxiexzf = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final int[] f10858Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final int[] f10859Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final byte[] f10860Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final byte[] f10861Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final byte[] f10862Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final byte[] f10863Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static final byte[] f10864Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static final byte[] f10865Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final byte[] f10866Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final byte[] f10867Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final byte[] f10868Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final byte[] f10869Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final byte[] f10870feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final byte[] f10871feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final byte[] f10872feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final String[] f10873feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final int[] f10874feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final byte[] f10875feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static final C3494Ujhhgtgfeyxiexzf f10876feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static final C3494Ujhhgtgfeyxiexzf[][] f10877feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static final C3494Ujhhgtgfeyxiexzf[] f10878feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final HashMap[] f10879feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static final HashMap[] f10880feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final HashSet f10881feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public static final HashMap f10882feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public static final Charset f10883feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static final byte[] f10884feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final byte[] f10885feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final FileDescriptor f10886Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final AssetManager.AssetInputStream f10887Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f10888Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final HashMap[] f10889Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final HashSet f10890Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public ByteOrder f10891Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f10892Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f10893Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f10894Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f10895Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f10896Ujhhgtgfeyxiexzf;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f10858Ujhhgtgfeyxiexzf = new int[]{8, 8, 8};
        f10859Ujhhgtgfeyxiexzf = new int[]{8};
        f10860Ujhhgtgfeyxiexzf = new byte[]{-1, JSONB.Constants.BC_INT64_NUM_MIN, -1};
        f10861Ujhhgtgfeyxiexzf = new byte[]{102, 116, JSONB.Constants.BC_STR_ASCII, 112};
        f10862Ujhhgtgfeyxiexzf = new byte[]{JSONB.Constants.BC_STR_ASCII_FIX_36, JSONB.Constants.BC_STR_ASCII_FIX_32, 102, 49};
        f10863Ujhhgtgfeyxiexzf = new byte[]{104, 101, JSONB.Constants.BC_STR_ASCII_FIX_32, 99};
        f10864Ujhhgtgfeyxiexzf = new byte[]{79, 76, 89, JSONB.Constants.BC_STR_ASCII_FIX_4, 80, 0};
        f10865Ujhhgtgfeyxiexzf = new byte[]{79, 76, 89, JSONB.Constants.BC_STR_ASCII_FIX_4, 80, 85, 83, 0, 73, 73};
        f10866Ujhhgtgfeyxiexzf = new byte[]{-119, 80, JSONB.Constants.BC_STR_ASCII_FIX_5, JSONB.Constants.BC_INT32_SHORT_MAX, ek.k, 10, 26, 10};
        f10867Ujhhgtgfeyxiexzf = new byte[]{101, 88, 73, 102};
        f10868Ujhhgtgfeyxiexzf = new byte[]{73, JSONB.Constants.BC_INT32, JSONB.Constants.BC_INT32_SHORT_ZERO, 82};
        f10869Ujhhgtgfeyxiexzf = new byte[]{73, 69, JSONB.Constants.BC_STR_ASCII_FIX_5, JSONB.Constants.BC_INT32_SHORT_ZERO};
        f10870feyxiexzfUjhhgtg = new byte[]{82, 73, 70, 70};
        f10871feyxiexzfUjhhgtg = new byte[]{87, 69, 66, 80};
        f10872feyxiexzfUjhhgtg = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f10873feyxiexzfUjhhgtg = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f10874feyxiexzfUjhhgtg = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f10875feyxiexzfUjhhgtg = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C3494Ujhhgtgfeyxiexzf[] c3494UjhhgtgfeyxiexzfArr = {new C3494Ujhhgtgfeyxiexzf("NewSubfileType", 254, 4), new C3494Ujhhgtgfeyxiexzf("SubfileType", 255, 4), new C3494Ujhhgtgfeyxiexzf(bc.e, "ImageWidth", 3, 4), new C3494Ujhhgtgfeyxiexzf(257, "ImageLength", 3, 4), new C3494Ujhhgtgfeyxiexzf("BitsPerSample", 258, 3), new C3494Ujhhgtgfeyxiexzf("Compression", 259, 3), new C3494Ujhhgtgfeyxiexzf("PhotometricInterpretation", 262, 3), new C3494Ujhhgtgfeyxiexzf("ImageDescription", 270, 2), new C3494Ujhhgtgfeyxiexzf("Make", 271, 2), new C3494Ujhhgtgfeyxiexzf("Model", 272, 2), new C3494Ujhhgtgfeyxiexzf(b.a, "StripOffsets", 3, 4), new C3494Ujhhgtgfeyxiexzf("Orientation", 274, 3), new C3494Ujhhgtgfeyxiexzf("SamplesPerPixel", 277, 3), new C3494Ujhhgtgfeyxiexzf(278, "RowsPerStrip", 3, 4), new C3494Ujhhgtgfeyxiexzf(279, "StripByteCounts", 3, 4), new C3494Ujhhgtgfeyxiexzf("XResolution", 282, 5), new C3494Ujhhgtgfeyxiexzf("YResolution", 283, 5), new C3494Ujhhgtgfeyxiexzf("PlanarConfiguration", 284, 3), new C3494Ujhhgtgfeyxiexzf("ResolutionUnit", 296, 3), new C3494Ujhhgtgfeyxiexzf("TransferFunction", c.p, 3), new C3494Ujhhgtgfeyxiexzf("Software", 305, 2), new C3494Ujhhgtgfeyxiexzf("DateTime", 306, 2), new C3494Ujhhgtgfeyxiexzf("Artist", 315, 2), new C3494Ujhhgtgfeyxiexzf("WhitePoint", 318, 5), new C3494Ujhhgtgfeyxiexzf("PrimaryChromaticities", 319, 5), new C3494Ujhhgtgfeyxiexzf("SubIFDPointer", 330, 4), new C3494Ujhhgtgfeyxiexzf("JPEGInterchangeFormat", 513, 4), new C3494Ujhhgtgfeyxiexzf("JPEGInterchangeFormatLength", 514, 4), new C3494Ujhhgtgfeyxiexzf("YCbCrCoefficients", 529, 5), new C3494Ujhhgtgfeyxiexzf("YCbCrSubSampling", 530, 3), new C3494Ujhhgtgfeyxiexzf("YCbCrPositioning", 531, 3), new C3494Ujhhgtgfeyxiexzf("ReferenceBlackWhite", 532, 5), new C3494Ujhhgtgfeyxiexzf("Copyright", 33432, 2), new C3494Ujhhgtgfeyxiexzf("ExifIFDPointer", 34665, 4), new C3494Ujhhgtgfeyxiexzf("GPSInfoIFDPointer", 34853, 4), new C3494Ujhhgtgfeyxiexzf("SensorTopBorder", 4, 4), new C3494Ujhhgtgfeyxiexzf("SensorLeftBorder", 5, 4), new C3494Ujhhgtgfeyxiexzf("SensorBottomBorder", 6, 4), new C3494Ujhhgtgfeyxiexzf("SensorRightBorder", 7, 4), new C3494Ujhhgtgfeyxiexzf("ISO", 23, 3), new C3494Ujhhgtgfeyxiexzf("JpgFromRaw", 46, 7), new C3494Ujhhgtgfeyxiexzf("Xmp", 700, 1)};
        C3494Ujhhgtgfeyxiexzf[] c3494UjhhgtgfeyxiexzfArr2 = {new C3494Ujhhgtgfeyxiexzf("ExposureTime", 33434, 5), new C3494Ujhhgtgfeyxiexzf("FNumber", 33437, 5), new C3494Ujhhgtgfeyxiexzf("ExposureProgram", 34850, 3), new C3494Ujhhgtgfeyxiexzf("SpectralSensitivity", 34852, 2), new C3494Ujhhgtgfeyxiexzf("PhotographicSensitivity", 34855, 3), new C3494Ujhhgtgfeyxiexzf("OECF", 34856, 7), new C3494Ujhhgtgfeyxiexzf("SensitivityType", 34864, 3), new C3494Ujhhgtgfeyxiexzf("StandardOutputSensitivity", 34865, 4), new C3494Ujhhgtgfeyxiexzf("RecommendedExposureIndex", 34866, 4), new C3494Ujhhgtgfeyxiexzf("ISOSpeed", 34867, 4), new C3494Ujhhgtgfeyxiexzf("ISOSpeedLatitudeyyy", 34868, 4), new C3494Ujhhgtgfeyxiexzf("ISOSpeedLatitudezzz", 34869, 4), new C3494Ujhhgtgfeyxiexzf("ExifVersion", 36864, 2), new C3494Ujhhgtgfeyxiexzf("DateTimeOriginal", 36867, 2), new C3494Ujhhgtgfeyxiexzf("DateTimeDigitized", 36868, 2), new C3494Ujhhgtgfeyxiexzf("OffsetTime", 36880, 2), new C3494Ujhhgtgfeyxiexzf("OffsetTimeOriginal", 36881, 2), new C3494Ujhhgtgfeyxiexzf("OffsetTimeDigitized", 36882, 2), new C3494Ujhhgtgfeyxiexzf("ComponentsConfiguration", 37121, 7), new C3494Ujhhgtgfeyxiexzf("CompressedBitsPerPixel", 37122, 5), new C3494Ujhhgtgfeyxiexzf("ShutterSpeedValue", 37377, 10), new C3494Ujhhgtgfeyxiexzf("ApertureValue", 37378, 5), new C3494Ujhhgtgfeyxiexzf("BrightnessValue", 37379, 10), new C3494Ujhhgtgfeyxiexzf("ExposureBiasValue", 37380, 10), new C3494Ujhhgtgfeyxiexzf("MaxApertureValue", 37381, 5), new C3494Ujhhgtgfeyxiexzf("SubjectDistance", 37382, 5), new C3494Ujhhgtgfeyxiexzf("MeteringMode", 37383, 3), new C3494Ujhhgtgfeyxiexzf("LightSource", 37384, 3), new C3494Ujhhgtgfeyxiexzf("Flash", 37385, 3), new C3494Ujhhgtgfeyxiexzf("FocalLength", 37386, 5), new C3494Ujhhgtgfeyxiexzf("SubjectArea", 37396, 3), new C3494Ujhhgtgfeyxiexzf("MakerNote", 37500, 7), new C3494Ujhhgtgfeyxiexzf("UserComment", 37510, 7), new C3494Ujhhgtgfeyxiexzf("SubSecTime", 37520, 2), new C3494Ujhhgtgfeyxiexzf("SubSecTimeOriginal", 37521, 2), new C3494Ujhhgtgfeyxiexzf("SubSecTimeDigitized", 37522, 2), new C3494Ujhhgtgfeyxiexzf("FlashpixVersion", 40960, 7), new C3494Ujhhgtgfeyxiexzf("ColorSpace", 40961, 3), new C3494Ujhhgtgfeyxiexzf(40962, "PixelXDimension", 3, 4), new C3494Ujhhgtgfeyxiexzf(40963, "PixelYDimension", 3, 4), new C3494Ujhhgtgfeyxiexzf("RelatedSoundFile", 40964, 2), new C3494Ujhhgtgfeyxiexzf("InteroperabilityIFDPointer", 40965, 4), new C3494Ujhhgtgfeyxiexzf("FlashEnergy", 41483, 5), new C3494Ujhhgtgfeyxiexzf("SpatialFrequencyResponse", 41484, 7), new C3494Ujhhgtgfeyxiexzf("FocalPlaneXResolution", 41486, 5), new C3494Ujhhgtgfeyxiexzf("FocalPlaneYResolution", 41487, 5), new C3494Ujhhgtgfeyxiexzf("FocalPlaneResolutionUnit", 41488, 3), new C3494Ujhhgtgfeyxiexzf("SubjectLocation", 41492, 3), new C3494Ujhhgtgfeyxiexzf("ExposureIndex", 41493, 5), new C3494Ujhhgtgfeyxiexzf("SensingMethod", 41495, 3), new C3494Ujhhgtgfeyxiexzf("FileSource", 41728, 7), new C3494Ujhhgtgfeyxiexzf("SceneType", 41729, 7), new C3494Ujhhgtgfeyxiexzf("CFAPattern", 41730, 7), new C3494Ujhhgtgfeyxiexzf("CustomRendered", 41985, 3), new C3494Ujhhgtgfeyxiexzf("ExposureMode", 41986, 3), new C3494Ujhhgtgfeyxiexzf("WhiteBalance", 41987, 3), new C3494Ujhhgtgfeyxiexzf("DigitalZoomRatio", 41988, 5), new C3494Ujhhgtgfeyxiexzf("FocalLengthIn35mmFilm", 41989, 3), new C3494Ujhhgtgfeyxiexzf("SceneCaptureType", 41990, 3), new C3494Ujhhgtgfeyxiexzf("GainControl", 41991, 3), new C3494Ujhhgtgfeyxiexzf("Contrast", 41992, 3), new C3494Ujhhgtgfeyxiexzf("Saturation", 41993, 3), new C3494Ujhhgtgfeyxiexzf("Sharpness", 41994, 3), new C3494Ujhhgtgfeyxiexzf("DeviceSettingDescription", 41995, 7), new C3494Ujhhgtgfeyxiexzf("SubjectDistanceRange", 41996, 3), new C3494Ujhhgtgfeyxiexzf("ImageUniqueID", 42016, 2), new C3494Ujhhgtgfeyxiexzf("CameraOwnerName", 42032, 2), new C3494Ujhhgtgfeyxiexzf("BodySerialNumber", 42033, 2), new C3494Ujhhgtgfeyxiexzf("LensSpecification", 42034, 5), new C3494Ujhhgtgfeyxiexzf("LensMake", 42035, 2), new C3494Ujhhgtgfeyxiexzf("LensModel", 42036, 2), new C3494Ujhhgtgfeyxiexzf("Gamma", 42240, 5), new C3494Ujhhgtgfeyxiexzf("DNGVersion", 50706, 1), new C3494Ujhhgtgfeyxiexzf(50720, "DefaultCropSize", 3, 4)};
        C3494Ujhhgtgfeyxiexzf[] c3494UjhhgtgfeyxiexzfArr3 = {new C3494Ujhhgtgfeyxiexzf("GPSVersionID", 0, 1), new C3494Ujhhgtgfeyxiexzf("GPSLatitudeRef", 1, 2), new C3494Ujhhgtgfeyxiexzf(2, "GPSLatitude", 5, 10), new C3494Ujhhgtgfeyxiexzf("GPSLongitudeRef", 3, 2), new C3494Ujhhgtgfeyxiexzf(4, "GPSLongitude", 5, 10), new C3494Ujhhgtgfeyxiexzf("GPSAltitudeRef", 5, 1), new C3494Ujhhgtgfeyxiexzf("GPSAltitude", 6, 5), new C3494Ujhhgtgfeyxiexzf("GPSTimeStamp", 7, 5), new C3494Ujhhgtgfeyxiexzf("GPSSatellites", 8, 2), new C3494Ujhhgtgfeyxiexzf("GPSStatus", 9, 2), new C3494Ujhhgtgfeyxiexzf("GPSMeasureMode", 10, 2), new C3494Ujhhgtgfeyxiexzf("GPSDOP", 11, 5), new C3494Ujhhgtgfeyxiexzf("GPSSpeedRef", 12, 2), new C3494Ujhhgtgfeyxiexzf("GPSSpeed", 13, 5), new C3494Ujhhgtgfeyxiexzf("GPSTrackRef", 14, 2), new C3494Ujhhgtgfeyxiexzf("GPSTrack", 15, 5), new C3494Ujhhgtgfeyxiexzf("GPSImgDirectionRef", 16, 2), new C3494Ujhhgtgfeyxiexzf("GPSImgDirection", 17, 5), new C3494Ujhhgtgfeyxiexzf("GPSMapDatum", 18, 2), new C3494Ujhhgtgfeyxiexzf("GPSDestLatitudeRef", 19, 2), new C3494Ujhhgtgfeyxiexzf("GPSDestLatitude", 20, 5), new C3494Ujhhgtgfeyxiexzf("GPSDestLongitudeRef", 21, 2), new C3494Ujhhgtgfeyxiexzf("GPSDestLongitude", 22, 5), new C3494Ujhhgtgfeyxiexzf("GPSDestBearingRef", 23, 2), new C3494Ujhhgtgfeyxiexzf("GPSDestBearing", 24, 5), new C3494Ujhhgtgfeyxiexzf("GPSDestDistanceRef", 25, 2), new C3494Ujhhgtgfeyxiexzf("GPSDestDistance", 26, 5), new C3494Ujhhgtgfeyxiexzf("GPSProcessingMethod", 27, 7), new C3494Ujhhgtgfeyxiexzf("GPSAreaInformation", 28, 7), new C3494Ujhhgtgfeyxiexzf("GPSDateStamp", 29, 2), new C3494Ujhhgtgfeyxiexzf("GPSDifferential", 30, 3), new C3494Ujhhgtgfeyxiexzf("GPSHPositioningError", 31, 5)};
        C3494Ujhhgtgfeyxiexzf[] c3494UjhhgtgfeyxiexzfArr4 = {new C3494Ujhhgtgfeyxiexzf("InteroperabilityIndex", 1, 2)};
        C3494Ujhhgtgfeyxiexzf[] c3494UjhhgtgfeyxiexzfArr5 = {new C3494Ujhhgtgfeyxiexzf("NewSubfileType", 254, 4), new C3494Ujhhgtgfeyxiexzf("SubfileType", 255, 4), new C3494Ujhhgtgfeyxiexzf(bc.e, "ThumbnailImageWidth", 3, 4), new C3494Ujhhgtgfeyxiexzf(257, "ThumbnailImageLength", 3, 4), new C3494Ujhhgtgfeyxiexzf("BitsPerSample", 258, 3), new C3494Ujhhgtgfeyxiexzf("Compression", 259, 3), new C3494Ujhhgtgfeyxiexzf("PhotometricInterpretation", 262, 3), new C3494Ujhhgtgfeyxiexzf("ImageDescription", 270, 2), new C3494Ujhhgtgfeyxiexzf("Make", 271, 2), new C3494Ujhhgtgfeyxiexzf("Model", 272, 2), new C3494Ujhhgtgfeyxiexzf(b.a, "StripOffsets", 3, 4), new C3494Ujhhgtgfeyxiexzf("ThumbnailOrientation", 274, 3), new C3494Ujhhgtgfeyxiexzf("SamplesPerPixel", 277, 3), new C3494Ujhhgtgfeyxiexzf(278, "RowsPerStrip", 3, 4), new C3494Ujhhgtgfeyxiexzf(279, "StripByteCounts", 3, 4), new C3494Ujhhgtgfeyxiexzf("XResolution", 282, 5), new C3494Ujhhgtgfeyxiexzf("YResolution", 283, 5), new C3494Ujhhgtgfeyxiexzf("PlanarConfiguration", 284, 3), new C3494Ujhhgtgfeyxiexzf("ResolutionUnit", 296, 3), new C3494Ujhhgtgfeyxiexzf("TransferFunction", c.p, 3), new C3494Ujhhgtgfeyxiexzf("Software", 305, 2), new C3494Ujhhgtgfeyxiexzf("DateTime", 306, 2), new C3494Ujhhgtgfeyxiexzf("Artist", 315, 2), new C3494Ujhhgtgfeyxiexzf("WhitePoint", 318, 5), new C3494Ujhhgtgfeyxiexzf("PrimaryChromaticities", 319, 5), new C3494Ujhhgtgfeyxiexzf("SubIFDPointer", 330, 4), new C3494Ujhhgtgfeyxiexzf("JPEGInterchangeFormat", 513, 4), new C3494Ujhhgtgfeyxiexzf("JPEGInterchangeFormatLength", 514, 4), new C3494Ujhhgtgfeyxiexzf("YCbCrCoefficients", 529, 5), new C3494Ujhhgtgfeyxiexzf("YCbCrSubSampling", 530, 3), new C3494Ujhhgtgfeyxiexzf("YCbCrPositioning", 531, 3), new C3494Ujhhgtgfeyxiexzf("ReferenceBlackWhite", 532, 5), new C3494Ujhhgtgfeyxiexzf("Copyright", 33432, 2), new C3494Ujhhgtgfeyxiexzf("ExifIFDPointer", 34665, 4), new C3494Ujhhgtgfeyxiexzf("GPSInfoIFDPointer", 34853, 4), new C3494Ujhhgtgfeyxiexzf("DNGVersion", 50706, 1), new C3494Ujhhgtgfeyxiexzf(50720, "DefaultCropSize", 3, 4)};
        f10876feyxiexzfUjhhgtg = new C3494Ujhhgtgfeyxiexzf("StripOffsets", b.a, 3);
        f10877feyxiexzfUjhhgtg = new C3494Ujhhgtgfeyxiexzf[][]{c3494UjhhgtgfeyxiexzfArr, c3494UjhhgtgfeyxiexzfArr2, c3494UjhhgtgfeyxiexzfArr3, c3494UjhhgtgfeyxiexzfArr4, c3494UjhhgtgfeyxiexzfArr5, c3494UjhhgtgfeyxiexzfArr, new C3494Ujhhgtgfeyxiexzf[]{new C3494Ujhhgtgfeyxiexzf("ThumbnailImage", bc.e, 7), new C3494Ujhhgtgfeyxiexzf("CameraSettingsIFDPointer", 8224, 4), new C3494Ujhhgtgfeyxiexzf("ImageProcessingIFDPointer", 8256, 4)}, new C3494Ujhhgtgfeyxiexzf[]{new C3494Ujhhgtgfeyxiexzf("PreviewImageStart", 257, 4), new C3494Ujhhgtgfeyxiexzf("PreviewImageLength", 258, 4)}, new C3494Ujhhgtgfeyxiexzf[]{new C3494Ujhhgtgfeyxiexzf("AspectFrame", 4371, 3)}, new C3494Ujhhgtgfeyxiexzf[]{new C3494Ujhhgtgfeyxiexzf("ColorSpace", 55, 3)}};
        f10878feyxiexzfUjhhgtg = new C3494Ujhhgtgfeyxiexzf[]{new C3494Ujhhgtgfeyxiexzf("SubIFDPointer", 330, 4), new C3494Ujhhgtgfeyxiexzf("ExifIFDPointer", 34665, 4), new C3494Ujhhgtgfeyxiexzf("GPSInfoIFDPointer", 34853, 4), new C3494Ujhhgtgfeyxiexzf("InteroperabilityIFDPointer", 40965, 4), new C3494Ujhhgtgfeyxiexzf("CameraSettingsIFDPointer", 8224, 1), new C3494Ujhhgtgfeyxiexzf("ImageProcessingIFDPointer", 8256, 1)};
        f10879feyxiexzfUjhhgtg = new HashMap[10];
        f10880feyxiexzfUjhhgtg = new HashMap[10];
        f10881feyxiexzfUjhhgtg = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f10882feyxiexzfUjhhgtg = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f10883feyxiexzfUjhhgtg = charsetForName;
        f10884feyxiexzfUjhhgtg = "Exif\u0000\u0000".getBytes(charsetForName);
        f10885feyxiexzfUjhhgtg = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C3494Ujhhgtgfeyxiexzf[][] c3494UjhhgtgfeyxiexzfArr6 = f10877feyxiexzfUjhhgtg;
            if (i >= c3494UjhhgtgfeyxiexzfArr6.length) {
                HashMap map = f10882feyxiexzfUjhhgtg;
                C3494Ujhhgtgfeyxiexzf[] c3494UjhhgtgfeyxiexzfArr7 = f10878feyxiexzfUjhhgtg;
                map.put(Integer.valueOf(c3494UjhhgtgfeyxiexzfArr7[0].f10851Ujhhgtgfeyxiexzf), 5);
                map.put(Integer.valueOf(c3494UjhhgtgfeyxiexzfArr7[1].f10851Ujhhgtgfeyxiexzf), 1);
                map.put(Integer.valueOf(c3494UjhhgtgfeyxiexzfArr7[2].f10851Ujhhgtgfeyxiexzf), 2);
                map.put(Integer.valueOf(c3494UjhhgtgfeyxiexzfArr7[3].f10851Ujhhgtgfeyxiexzf), 3);
                map.put(Integer.valueOf(c3494UjhhgtgfeyxiexzfArr7[4].f10851Ujhhgtgfeyxiexzf), 7);
                map.put(Integer.valueOf(c3494UjhhgtgfeyxiexzfArr7[5].f10851Ujhhgtgfeyxiexzf), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f10879feyxiexzfUjhhgtg[i] = new HashMap();
            f10880feyxiexzfUjhhgtg[i] = new HashMap();
            for (C3494Ujhhgtgfeyxiexzf c3494Ujhhgtgfeyxiexzf : c3494UjhhgtgfeyxiexzfArr6[i]) {
                f10879feyxiexzfUjhhgtg[i].put(Integer.valueOf(c3494Ujhhgtgfeyxiexzf.f10851Ujhhgtgfeyxiexzf), c3494Ujhhgtgfeyxiexzf);
                f10880feyxiexzfUjhhgtg[i].put(c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf, c3494Ujhhgtgfeyxiexzf);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public C3497Ujhhgtgfeyxiexzf(InputStream inputStream) throws IOException {
        C3494Ujhhgtgfeyxiexzf[][] c3494UjhhgtgfeyxiexzfArr = f10877feyxiexzfUjhhgtg;
        this.f10889Ujhhgtgfeyxiexzf = new HashMap[c3494UjhhgtgfeyxiexzfArr.length];
        this.f10890Ujhhgtgfeyxiexzf = new HashSet(c3494UjhhgtgfeyxiexzfArr.length);
        this.f10891Ujhhgtgfeyxiexzf = ByteOrder.BIG_ENDIAN;
        boolean z = inputStream instanceof AssetManager.AssetInputStream;
        boolean z2 = f10857Ujhhgtgfeyxiexzf;
        if (z) {
            this.f10887Ujhhgtgfeyxiexzf = (AssetManager.AssetInputStream) inputStream;
            this.f10886Ujhhgtgfeyxiexzf = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC3499feyxiexzfUjhhgtg.m5015Ujhhgtgfeyxiexzf(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f10887Ujhhgtgfeyxiexzf = null;
                this.f10886Ujhhgtgfeyxiexzf = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z2) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f10887Ujhhgtgfeyxiexzf = null;
                this.f10886Ujhhgtgfeyxiexzf = null;
            }
        } else {
            this.f10887Ujhhgtgfeyxiexzf = null;
            this.f10886Ujhhgtgfeyxiexzf = null;
        }
        for (int i = 0; i < c3494UjhhgtgfeyxiexzfArr.length; i++) {
            try {
                try {
                    this.f10889Ujhhgtgfeyxiexzf[i] = new HashMap();
                } catch (Throwable th) {
                    m4990Ujhhgtgfeyxiexzf();
                    if (z2) {
                        m5005Ujhhgtgfeyxiexzf();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m4990Ujhhgtgfeyxiexzf();
                if (!z2) {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m4990Ujhhgtgfeyxiexzf();
                if (!z2) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM4995Ujhhgtgfeyxiexzf = m4995Ujhhgtgfeyxiexzf(bufferedInputStream);
        this.f10888Ujhhgtgfeyxiexzf = iM4995Ujhhgtgfeyxiexzf;
        if (iM4995Ujhhgtgfeyxiexzf == 4 || iM4995Ujhhgtgfeyxiexzf == 9 || iM4995Ujhhgtgfeyxiexzf == 13 || iM4995Ujhhgtgfeyxiexzf == 14) {
            C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg = new C3363feyxiexzfUjhhgtg(bufferedInputStream);
            int i2 = this.f10888Ujhhgtgfeyxiexzf;
            if (i2 == 4) {
                m4994Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg, 0, 0);
            } else if (i2 == 13) {
                m4997Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg);
            } else if (i2 == 9) {
                m4998Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg);
            } else if (i2 == 14) {
                m5001Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg);
            }
        } else {
            C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf = new C3496Ujhhgtgfeyxiexzf(bufferedInputStream);
            int i3 = this.f10888Ujhhgtgfeyxiexzf;
            if (i3 == 12) {
                m4993Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf);
            } else if (i3 == 7) {
                m4996Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf);
            } else if (i3 == 10) {
                m5000Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf);
            } else {
                m4999Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf);
            }
            c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(this.f10893Ujhhgtgfeyxiexzf);
            m5009Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf);
        }
        m4990Ujhhgtgfeyxiexzf();
        if (!z2) {
            return;
        }
        m5005Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static ByteOrder m4989Ujhhgtgfeyxiexzf(C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg) throws IOException {
        short s = c3363feyxiexzfUjhhgtg.readShort();
        boolean z = f10857Ujhhgtgfeyxiexzf;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4990Ujhhgtgfeyxiexzf() {
        String strM4991Ujhhgtgfeyxiexzf = m4991Ujhhgtgfeyxiexzf("DateTimeOriginal");
        HashMap[] mapArr = this.f10889Ujhhgtgfeyxiexzf;
        if (strM4991Ujhhgtgfeyxiexzf != null && m4991Ujhhgtgfeyxiexzf("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM4991Ujhhgtgfeyxiexzf.concat("\u0000").getBytes(f10883feyxiexzfUjhhgtg);
            map.put("DateTime", new C3493Ujhhgtgfeyxiexzf(2, bytes.length, bytes));
        }
        if (m4991Ujhhgtgfeyxiexzf("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C3493Ujhhgtgfeyxiexzf.m4981Ujhhgtgfeyxiexzf(0L, this.f10891Ujhhgtgfeyxiexzf));
        }
        if (m4991Ujhhgtgfeyxiexzf("ImageLength") == null) {
            mapArr[0].put("ImageLength", C3493Ujhhgtgfeyxiexzf.m4981Ujhhgtgfeyxiexzf(0L, this.f10891Ujhhgtgfeyxiexzf));
        }
        if (m4991Ujhhgtgfeyxiexzf("Orientation") == null) {
            mapArr[0].put("Orientation", C3493Ujhhgtgfeyxiexzf.m4981Ujhhgtgfeyxiexzf(0L, this.f10891Ujhhgtgfeyxiexzf));
        }
        if (m4991Ujhhgtgfeyxiexzf("LightSource") == null) {
            mapArr[1].put("LightSource", C3493Ujhhgtgfeyxiexzf.m4981Ujhhgtgfeyxiexzf(0L, this.f10891Ujhhgtgfeyxiexzf));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String m4991Ujhhgtgfeyxiexzf(String str) {
        C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4992Ujhhgtgfeyxiexzf = m4992Ujhhgtgfeyxiexzf(str);
        if (c3493UjhhgtgfeyxiexzfM4992Ujhhgtgfeyxiexzf != null) {
            int i = c3493UjhhgtgfeyxiexzfM4992Ujhhgtgfeyxiexzf.f10847Ujhhgtgfeyxiexzf;
            if (!f10881feyxiexzfUjhhgtg.contains(str)) {
                return c3493UjhhgtgfeyxiexzfM4992Ujhhgtgfeyxiexzf.m4986Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C3495Ujhhgtgfeyxiexzf[] c3495UjhhgtgfeyxiexzfArr = (C3495Ujhhgtgfeyxiexzf[]) c3493UjhhgtgfeyxiexzfM4992Ujhhgtgfeyxiexzf.m4987Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
                if (c3495UjhhgtgfeyxiexzfArr == null || c3495UjhhgtgfeyxiexzfArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c3495UjhhgtgfeyxiexzfArr));
                    return null;
                }
                C3495Ujhhgtgfeyxiexzf c3495Ujhhgtgfeyxiexzf = c3495UjhhgtgfeyxiexzfArr[0];
                Integer numValueOf = Integer.valueOf((int) (c3495Ujhhgtgfeyxiexzf.f10855Ujhhgtgfeyxiexzf / c3495Ujhhgtgfeyxiexzf.f10856Ujhhgtgfeyxiexzf));
                C3495Ujhhgtgfeyxiexzf c3495Ujhhgtgfeyxiexzf2 = c3495UjhhgtgfeyxiexzfArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c3495Ujhhgtgfeyxiexzf2.f10855Ujhhgtgfeyxiexzf / c3495Ujhhgtgfeyxiexzf2.f10856Ujhhgtgfeyxiexzf));
                C3495Ujhhgtgfeyxiexzf c3495Ujhhgtgfeyxiexzf3 = c3495UjhhgtgfeyxiexzfArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c3495Ujhhgtgfeyxiexzf3.f10855Ujhhgtgfeyxiexzf / c3495Ujhhgtgfeyxiexzf3.f10856Ujhhgtgfeyxiexzf)));
            }
            try {
                return Double.toString(c3493UjhhgtgfeyxiexzfM4992Ujhhgtgfeyxiexzf.m4984Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3493Ujhhgtgfeyxiexzf m4992Ujhhgtgfeyxiexzf(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f10857Ujhhgtgfeyxiexzf) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f10877feyxiexzfUjhhgtg.length; i++) {
            C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf = (C3493Ujhhgtgfeyxiexzf) this.f10889Ujhhgtgfeyxiexzf[i].get(str);
            if (c3493Ujhhgtgfeyxiexzf != null) {
                return c3493Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m4993Ujhhgtgfeyxiexzf(C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC3500feyxiexzfUjhhgtg.m5016Ujhhgtgfeyxiexzf(mediaMetadataRetriever, new C3364feyxiexzfUjhhgtg(c3496Ujhhgtgfeyxiexzf));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f10889Ujhhgtgfeyxiexzf;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(Integer.parseInt(strExtractMetadata), this.f10891Ujhhgtgfeyxiexzf));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(Integer.parseInt(strExtractMetadata2), this.f10891Ujhhgtgfeyxiexzf));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(i, this.f10891Ujhhgtgfeyxiexzf));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(i3);
                    byte[] bArr = new byte[6];
                    if (c3496Ujhhgtgfeyxiexzf.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, f10884feyxiexzfUjhhgtg)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (c3496Ujhhgtgfeyxiexzf.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.f10893Ujhhgtgfeyxiexzf = i5;
                    m5006Ujhhgtgfeyxiexzf(0, bArr2);
                }
                if (f10857Ujhhgtgfeyxiexzf) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146 A[LOOP:2: B:69:0x013c->B:74:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m4994Ujhhgtgfeyxiexzf(p000.C3363feyxiexzfUjhhgtg r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3497Ujhhgtgfeyxiexzf.m4994Ujhhgtgfeyxiexzf(上海高中ᛱ谢子非ᛱ要点脸ᛲᛴᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x014d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0156 A[LOOP:2: B:113:0x0148->B:118:0x0156, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x015c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x015f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0166  */
    /* JADX WARN: Code duplicated, block: B:129:0x016f A[LOOP:3: B:124:0x0161->B:129:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x0179  */
    /* JADX WARN: Code duplicated, block: B:136:0x0183 A[LOOP:4: B:131:0x0174->B:136:0x0183, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x0188 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:140:0x018b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x016c A[EDGE_INSN: B:171:0x016c->B:128:0x016c BREAK  A[LOOP:3: B:124:0x0161->B:129:0x016f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0186 A[EDGE_INSN: B:172:0x0186->B:137:0x0186 BREAK  A[LOOP:4: B:131:0x0174->B:136:0x0183], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x016c A[EDGE_INSN: B:173:0x016c->B:128:0x016c BREAK  A[LOOP:3: B:124:0x0161->B:129:0x016f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int m4995Ujhhgtgfeyxiexzf(BufferedInputStream bufferedInputStream) throws Throwable {
        C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg;
        int i;
        C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg2;
        C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg3;
        C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg4;
        int i2;
        C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg5;
        C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg6;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        int i6;
        byte[] bArr2;
        int i7;
        byte[] bArr3;
        C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg7;
        short s;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr5 = f10860Ujhhgtgfeyxiexzf;
            if (i8 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i8] != bArr5[i8]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i9 = 0; i9 < bytes.length; i9++) {
                    if (bArr4[i9] != bytes[i9]) {
                        int i10 = 1;
                        try {
                            c3363feyxiexzfUjhhgtg2 = new C3363feyxiexzfUjhhgtg(bArr4);
                            try {
                                try {
                                    long j2 = c3363feyxiexzfUjhhgtg2.readInt();
                                    byte[] bArr6 = new byte[4];
                                    c3363feyxiexzfUjhhgtg2.read(bArr6);
                                    try {
                                        try {
                                            if (Arrays.equals(bArr6, f10861Ujhhgtgfeyxiexzf)) {
                                                if (j2 == 1) {
                                                    j2 = c3363feyxiexzfUjhhgtg2.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                    c3363feyxiexzfUjhhgtg4 = new C3363feyxiexzfUjhhgtg(bArr4);
                                                    ByteOrder byteOrderM4989Ujhhgtgfeyxiexzf = m4989Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg4);
                                                    this.f10891Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf;
                                                    c3363feyxiexzfUjhhgtg4.f10516Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf;
                                                    s = c3363feyxiexzfUjhhgtg4.readShort();
                                                    if (s != 20306 || s == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    c3363feyxiexzfUjhhgtg4.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    try {
                                                        c3363feyxiexzfUjhhgtg7 = new C3363feyxiexzfUjhhgtg(bArr4);
                                                        try {
                                                            ByteOrder byteOrderM4989Ujhhgtgfeyxiexzf2 = m4989Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg7);
                                                            this.f10891Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf2;
                                                            c3363feyxiexzfUjhhgtg7.f10516Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf2;
                                                            if (c3363feyxiexzfUjhhgtg7.readShort() == 85) {
                                                                i3 = 1;
                                                            } else {
                                                                i3 = i;
                                                            }
                                                            c3363feyxiexzfUjhhgtg7.close();
                                                        } catch (Exception unused) {
                                                            c3363feyxiexzfUjhhgtg6 = c3363feyxiexzfUjhhgtg7;
                                                            if (c3363feyxiexzfUjhhgtg6 != null) {
                                                                c3363feyxiexzfUjhhgtg6.close();
                                                            }
                                                            i3 = i;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            c3363feyxiexzfUjhhgtg5 = c3363feyxiexzfUjhhgtg7;
                                                            if (c3363feyxiexzfUjhhgtg5 != null) {
                                                                c3363feyxiexzfUjhhgtg5.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused2) {
                                                        c3363feyxiexzfUjhhgtg6 = null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c3363feyxiexzfUjhhgtg5 = null;
                                                    }
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = f10866Ujhhgtgfeyxiexzf;
                                                        if (i4 < bArr.length) {
                                                            i5 = 1;
                                                            break;
                                                        }
                                                        if (bArr4[i4] != bArr[i4]) {
                                                            i5 = i;
                                                            break;
                                                        }
                                                        i4++;
                                                    }
                                                    if (i5 != 0) {
                                                        return 13;
                                                    }
                                                    i6 = i;
                                                    while (true) {
                                                        bArr2 = f10870feyxiexzfUjhhgtg;
                                                        if (i6 < bArr2.length) {
                                                            i7 = i;
                                                            while (true) {
                                                                bArr3 = f10871feyxiexzfUjhhgtg;
                                                                if (i7 >= bArr3.length) {
                                                                    break;
                                                                }
                                                                if (bArr4[bArr2.length + i7 + 4] != bArr3[i7]) {
                                                                    break;
                                                                }
                                                                i7++;
                                                            }
                                                            if (i10 != 0) {
                                                                return 14;
                                                            }
                                                            return i;
                                                        }
                                                        if (bArr4[i6] != bArr2[i6]) {
                                                            break;
                                                        }
                                                        i6++;
                                                    }
                                                    i10 = i;
                                                    if (i10 != 0) {
                                                        return 14;
                                                    }
                                                    return i;
                                                }
                                                j = 8;
                                                i = 0;
                                                long j3 = 5000;
                                                if (j2 > j3) {
                                                    j2 = j3;
                                                }
                                                long j4 = j2 - j;
                                                if (j4 >= 8) {
                                                    try {
                                                        byte[] bArr7 = new byte[4];
                                                        boolean z = false;
                                                        boolean z2 = false;
                                                        for (long j5 = 0; j5 < j4 / 4 && c3363feyxiexzfUjhhgtg2.read(bArr7) == 4; j5++) {
                                                            if (j5 != 1) {
                                                                if (Arrays.equals(bArr7, f10862Ujhhgtgfeyxiexzf)) {
                                                                    z = true;
                                                                } else if (Arrays.equals(bArr7, f10863Ujhhgtgfeyxiexzf)) {
                                                                    z2 = true;
                                                                }
                                                                if (z && z2) {
                                                                    c3363feyxiexzfUjhhgtg2.close();
                                                                    return 12;
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        if (f10857Ujhhgtgfeyxiexzf) {
                                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                        }
                                                        if (c3363feyxiexzfUjhhgtg2 != null) {
                                                        }
                                                        c3363feyxiexzfUjhhgtg4 = new C3363feyxiexzfUjhhgtg(bArr4);
                                                        ByteOrder byteOrderM4989Ujhhgtgfeyxiexzf3 = m4989Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg4);
                                                        this.f10891Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf3;
                                                        c3363feyxiexzfUjhhgtg4.f10516Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf3;
                                                        s = c3363feyxiexzfUjhhgtg4.readShort();
                                                        if (s != 20306) {
                                                            i2 = 1;
                                                        } else {
                                                            i2 = 1;
                                                        }
                                                        c3363feyxiexzfUjhhgtg4.close();
                                                        if (i2 != 0) {
                                                            return 7;
                                                        }
                                                        c3363feyxiexzfUjhhgtg7 = new C3363feyxiexzfUjhhgtg(bArr4);
                                                        ByteOrder byteOrderM4989Ujhhgtgfeyxiexzf4 = m4989Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg7);
                                                        this.f10891Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf4;
                                                        c3363feyxiexzfUjhhgtg7.f10516Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf4;
                                                        if (c3363feyxiexzfUjhhgtg7.readShort() == 85) {
                                                            i3 = 1;
                                                        } else {
                                                            i3 = i;
                                                        }
                                                        c3363feyxiexzfUjhhgtg7.close();
                                                        if (i3 != 0) {
                                                            return 10;
                                                        }
                                                        i4 = i;
                                                        while (true) {
                                                            bArr = f10866Ujhhgtgfeyxiexzf;
                                                            if (i4 < bArr.length) {
                                                                i5 = 1;
                                                                break;
                                                            }
                                                            if (bArr4[i4] != bArr[i4]) {
                                                                i5 = i;
                                                                break;
                                                            }
                                                            i4++;
                                                        }
                                                        if (i5 != 0) {
                                                            return 13;
                                                        }
                                                        i6 = i;
                                                        while (true) {
                                                            bArr2 = f10870feyxiexzfUjhhgtg;
                                                            if (i6 < bArr2.length) {
                                                                i7 = i;
                                                                while (true) {
                                                                    bArr3 = f10871feyxiexzfUjhhgtg;
                                                                    if (i7 >= bArr3.length) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    if (bArr4[bArr2.length + i7 + 4] != bArr3[i7]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i7++;
                                                                }
                                                                if (i10 != 0) {
                                                                    return 14;
                                                                }
                                                                return i;
                                                            }
                                                            if (bArr4[i6] != bArr2[i6]) {
                                                                break;
                                                                break;
                                                            }
                                                            i6++;
                                                        }
                                                        i10 = i;
                                                        if (i10 != 0) {
                                                            return 14;
                                                        }
                                                        return i;
                                                    }
                                                }
                                                c3363feyxiexzfUjhhgtg2.close();
                                                c3363feyxiexzfUjhhgtg4 = new C3363feyxiexzfUjhhgtg(bArr4);
                                                ByteOrder byteOrderM4989Ujhhgtgfeyxiexzf5 = m4989Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg4);
                                                this.f10891Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf5;
                                                c3363feyxiexzfUjhhgtg4.f10516Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf5;
                                                s = c3363feyxiexzfUjhhgtg4.readShort();
                                                if (s != 20306) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                c3363feyxiexzfUjhhgtg4.close();
                                                if (i2 != 0) {
                                                    return 7;
                                                }
                                                c3363feyxiexzfUjhhgtg7 = new C3363feyxiexzfUjhhgtg(bArr4);
                                                ByteOrder byteOrderM4989Ujhhgtgfeyxiexzf6 = m4989Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg7);
                                                this.f10891Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf6;
                                                c3363feyxiexzfUjhhgtg7.f10516Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf6;
                                                if (c3363feyxiexzfUjhhgtg7.readShort() == 85) {
                                                    i3 = 1;
                                                } else {
                                                    i3 = i;
                                                }
                                                c3363feyxiexzfUjhhgtg7.close();
                                                if (i3 != 0) {
                                                    return 10;
                                                }
                                                i4 = i;
                                                while (true) {
                                                    bArr = f10866Ujhhgtgfeyxiexzf;
                                                    if (i4 < bArr.length) {
                                                        i5 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i4] != bArr[i4]) {
                                                        i5 = i;
                                                        break;
                                                    }
                                                    i4++;
                                                }
                                                if (i5 != 0) {
                                                    return 13;
                                                }
                                                i6 = i;
                                                while (true) {
                                                    bArr2 = f10870feyxiexzfUjhhgtg;
                                                    if (i6 < bArr2.length) {
                                                        i7 = i;
                                                        while (true) {
                                                            bArr3 = f10871feyxiexzfUjhhgtg;
                                                            if (i7 >= bArr3.length) {
                                                                break;
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i7 + 4] != bArr3[i7]) {
                                                                break;
                                                                break;
                                                            }
                                                            i7++;
                                                        }
                                                        if (i10 != 0) {
                                                            return 14;
                                                        }
                                                        return i;
                                                    }
                                                    if (bArr4[i6] != bArr2[i6]) {
                                                        break;
                                                        break;
                                                    }
                                                    i6++;
                                                }
                                                i10 = i;
                                                if (i10 != 0) {
                                                    return 14;
                                                }
                                                return i;
                                            }
                                            ByteOrder byteOrderM4989Ujhhgtgfeyxiexzf7 = m4989Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg4);
                                            this.f10891Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf7;
                                            c3363feyxiexzfUjhhgtg4.f10516Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf7;
                                            s = c3363feyxiexzfUjhhgtg4.readShort();
                                            if (s != 20306) {
                                                i2 = 1;
                                            } else {
                                                i2 = 1;
                                            }
                                            c3363feyxiexzfUjhhgtg4.close();
                                        } catch (Exception unused3) {
                                            if (c3363feyxiexzfUjhhgtg4 != null) {
                                                c3363feyxiexzfUjhhgtg4.close();
                                            }
                                            i2 = i;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            c3363feyxiexzfUjhhgtg3 = c3363feyxiexzfUjhhgtg4;
                                            if (c3363feyxiexzfUjhhgtg3 != null) {
                                                c3363feyxiexzfUjhhgtg3.close();
                                            }
                                            throw th;
                                        }
                                        c3363feyxiexzfUjhhgtg4 = new C3363feyxiexzfUjhhgtg(bArr4);
                                    } catch (Exception unused4) {
                                        c3363feyxiexzfUjhhgtg4 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c3363feyxiexzfUjhhgtg3 = null;
                                    }
                                    c3363feyxiexzfUjhhgtg2.close();
                                    i = 0;
                                } catch (Exception e2) {
                                    e = e2;
                                    i = 0;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c3363feyxiexzfUjhhgtg = c3363feyxiexzfUjhhgtg2;
                                if (c3363feyxiexzfUjhhgtg != null) {
                                    c3363feyxiexzfUjhhgtg.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = 0;
                            c3363feyxiexzfUjhhgtg2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            c3363feyxiexzfUjhhgtg = null;
                        }
                        if (i2 != 0) {
                            return 7;
                        }
                        c3363feyxiexzfUjhhgtg7 = new C3363feyxiexzfUjhhgtg(bArr4);
                        ByteOrder byteOrderM4989Ujhhgtgfeyxiexzf8 = m4989Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg7);
                        this.f10891Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf8;
                        c3363feyxiexzfUjhhgtg7.f10516Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf8;
                        if (c3363feyxiexzfUjhhgtg7.readShort() == 85) {
                            i3 = 1;
                        } else {
                            i3 = i;
                        }
                        c3363feyxiexzfUjhhgtg7.close();
                        if (i3 != 0) {
                            return 10;
                        }
                        i4 = i;
                        while (true) {
                            bArr = f10866Ujhhgtgfeyxiexzf;
                            if (i4 < bArr.length) {
                                i5 = 1;
                                break;
                            }
                            if (bArr4[i4] != bArr[i4]) {
                                i5 = i;
                                break;
                            }
                            i4++;
                        }
                        if (i5 != 0) {
                            return 13;
                        }
                        i6 = i;
                        while (true) {
                            bArr2 = f10870feyxiexzfUjhhgtg;
                            if (i6 < bArr2.length) {
                                i7 = i;
                                while (true) {
                                    bArr3 = f10871feyxiexzfUjhhgtg;
                                    if (i7 >= bArr3.length) {
                                        break;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i7 + 4] != bArr3[i7]) {
                                        break;
                                        break;
                                    }
                                    i7++;
                                }
                                if (i10 != 0) {
                                    return 14;
                                }
                                return i;
                            }
                            if (bArr4[i6] != bArr2[i6]) {
                                break;
                                break;
                            }
                            i6++;
                        }
                        i10 = i;
                        if (i10 != 0) {
                            return 14;
                        }
                        return i;
                    }
                }
                return 9;
            }
            i8++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m4996Ujhhgtgfeyxiexzf(C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf) throws Throwable {
        int i;
        int i2;
        m4999Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf);
        HashMap[] mapArr = this.f10889Ujhhgtgfeyxiexzf;
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf = (C3493Ujhhgtgfeyxiexzf) mapArr[1].get("MakerNote");
        if (c3493Ujhhgtgfeyxiexzf != null) {
            C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf2 = new C3496Ujhhgtgfeyxiexzf(c3493Ujhhgtgfeyxiexzf.f10850Ujhhgtgfeyxiexzf);
            c3496Ujhhgtgfeyxiexzf2.f10516Ujhhgtgfeyxiexzf = this.f10891Ujhhgtgfeyxiexzf;
            byte[] bArr = f10864Ujhhgtgfeyxiexzf;
            byte[] bArr2 = new byte[bArr.length];
            c3496Ujhhgtgfeyxiexzf2.readFully(bArr2);
            c3496Ujhhgtgfeyxiexzf2.m4988Ujhhgtgfeyxiexzf(0L);
            byte[] bArr3 = f10865Ujhhgtgfeyxiexzf;
            byte[] bArr4 = new byte[bArr3.length];
            c3496Ujhhgtgfeyxiexzf2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c3496Ujhhgtgfeyxiexzf2.m4988Ujhhgtgfeyxiexzf(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c3496Ujhhgtgfeyxiexzf2.m4988Ujhhgtgfeyxiexzf(12L);
            }
            m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf2, 6);
            C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf2 = (C3493Ujhhgtgfeyxiexzf) mapArr[7].get("PreviewImageStart");
            C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf3 = (C3493Ujhhgtgfeyxiexzf) mapArr[7].get("PreviewImageLength");
            if (c3493Ujhhgtgfeyxiexzf2 != null && c3493Ujhhgtgfeyxiexzf3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c3493Ujhhgtgfeyxiexzf2);
                mapArr[5].put("JPEGInterchangeFormatLength", c3493Ujhhgtgfeyxiexzf3);
            }
            C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf4 = (C3493Ujhhgtgfeyxiexzf) mapArr[8].get("AspectFrame");
            if (c3493Ujhhgtgfeyxiexzf4 != null) {
                int[] iArr = (int[]) c3493Ujhhgtgfeyxiexzf4.m4987Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf = C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(i5, this.f10891Ujhhgtgfeyxiexzf);
                C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf2 = C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(i6, this.f10891Ujhhgtgfeyxiexzf);
                mapArr[0].put("ImageWidth", c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf);
                mapArr[0].put("ImageLength", c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf2);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m4997Ujhhgtgfeyxiexzf(C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg) throws Throwable {
        if (f10857Ujhhgtgfeyxiexzf) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c3363feyxiexzfUjhhgtg);
        }
        c3363feyxiexzfUjhhgtg.f10516Ujhhgtgfeyxiexzf = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f10866Ujhhgtgfeyxiexzf;
        c3363feyxiexzfUjhhgtg.m4867Ujhhgtgfeyxiexzf(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c3363feyxiexzfUjhhgtg.readInt();
                byte[] bArr2 = new byte[4];
                if (c3363feyxiexzfUjhhgtg.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f10868Ujhhgtgfeyxiexzf)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f10869Ujhhgtgfeyxiexzf)) {
                    return;
                }
                if (Arrays.equals(bArr2, f10867Ujhhgtgfeyxiexzf)) {
                    byte[] bArr3 = new byte[i];
                    if (c3363feyxiexzfUjhhgtg.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC1937feyxiexzfUjhhgtg.m3273Ujhhgtgfeyxiexzf(bArr2));
                    }
                    int i3 = c3363feyxiexzfUjhhgtg.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f10893Ujhhgtgfeyxiexzf = i2;
                        m5006Ujhhgtgfeyxiexzf(0, bArr3);
                        m5012Ujhhgtgfeyxiexzf();
                        m5009Ujhhgtgfeyxiexzf(new C3363feyxiexzfUjhhgtg(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c3363feyxiexzfUjhhgtg.m4867Ujhhgtgfeyxiexzf(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m4998Ujhhgtgfeyxiexzf(C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg) throws Throwable {
        boolean z = f10857Ujhhgtgfeyxiexzf;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c3363feyxiexzfUjhhgtg);
        }
        c3363feyxiexzfUjhhgtg.m4867Ujhhgtgfeyxiexzf(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c3363feyxiexzfUjhhgtg.read(bArr);
        c3363feyxiexzfUjhhgtg.read(bArr2);
        c3363feyxiexzfUjhhgtg.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c3363feyxiexzfUjhhgtg.m4867Ujhhgtgfeyxiexzf(i - c3363feyxiexzfUjhhgtg.f10517Ujhhgtgfeyxiexzf);
        c3363feyxiexzfUjhhgtg.read(bArr4);
        m4994Ujhhgtgfeyxiexzf(new C3363feyxiexzfUjhhgtg(bArr4), i, 5);
        c3363feyxiexzfUjhhgtg.m4867Ujhhgtgfeyxiexzf(i3 - c3363feyxiexzfUjhhgtg.f10517Ujhhgtgfeyxiexzf);
        c3363feyxiexzfUjhhgtg.f10516Ujhhgtgfeyxiexzf = ByteOrder.BIG_ENDIAN;
        int i4 = c3363feyxiexzfUjhhgtg.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c3363feyxiexzfUjhhgtg.readUnsignedShort();
            int unsignedShort2 = c3363feyxiexzfUjhhgtg.readUnsignedShort();
            if (unsignedShort == f10876feyxiexzfUjhhgtg.f10851Ujhhgtgfeyxiexzf) {
                short s = c3363feyxiexzfUjhhgtg.readShort();
                short s2 = c3363feyxiexzfUjhhgtg.readShort();
                C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf = C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(s, this.f10891Ujhhgtgfeyxiexzf);
                C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf2 = C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(s2, this.f10891Ujhhgtgfeyxiexzf);
                HashMap[] mapArr = this.f10889Ujhhgtgfeyxiexzf;
                mapArr[0].put("ImageLength", c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf);
                mapArr[0].put("ImageWidth", c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf2);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            c3363feyxiexzfUjhhgtg.m4867Ujhhgtgfeyxiexzf(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m4999Ujhhgtgfeyxiexzf(C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf) throws Throwable {
        m5004Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf);
        m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, 0);
        m5011Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, 0);
        m5011Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, 5);
        m5011Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, 4);
        m5012Ujhhgtgfeyxiexzf();
        if (this.f10888Ujhhgtgfeyxiexzf == 8) {
            HashMap[] mapArr = this.f10889Ujhhgtgfeyxiexzf;
            C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf = (C3493Ujhhgtgfeyxiexzf) mapArr[1].get("MakerNote");
            if (c3493Ujhhgtgfeyxiexzf != null) {
                C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf2 = new C3496Ujhhgtgfeyxiexzf(c3493Ujhhgtgfeyxiexzf.f10850Ujhhgtgfeyxiexzf);
                c3496Ujhhgtgfeyxiexzf2.f10516Ujhhgtgfeyxiexzf = this.f10891Ujhhgtgfeyxiexzf;
                c3496Ujhhgtgfeyxiexzf2.m4867Ujhhgtgfeyxiexzf(6);
                m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf2, 9);
                C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf2 = (C3493Ujhhgtgfeyxiexzf) mapArr[9].get("ColorSpace");
                if (c3493Ujhhgtgfeyxiexzf2 != null) {
                    mapArr[1].put("ColorSpace", c3493Ujhhgtgfeyxiexzf2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m5000Ujhhgtgfeyxiexzf(C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf) throws Throwable {
        if (f10857Ujhhgtgfeyxiexzf) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c3496Ujhhgtgfeyxiexzf);
        }
        m4999Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf);
        HashMap[] mapArr = this.f10889Ujhhgtgfeyxiexzf;
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf = (C3493Ujhhgtgfeyxiexzf) mapArr[0].get("JpgFromRaw");
        if (c3493Ujhhgtgfeyxiexzf != null) {
            m4994Ujhhgtgfeyxiexzf(new C3363feyxiexzfUjhhgtg(c3493Ujhhgtgfeyxiexzf.f10850Ujhhgtgfeyxiexzf), (int) c3493Ujhhgtgfeyxiexzf.f10849Ujhhgtgfeyxiexzf, 5);
        }
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf2 = (C3493Ujhhgtgfeyxiexzf) mapArr[0].get("ISO");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf3 = (C3493Ujhhgtgfeyxiexzf) mapArr[1].get("PhotographicSensitivity");
        if (c3493Ujhhgtgfeyxiexzf2 == null || c3493Ujhhgtgfeyxiexzf3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c3493Ujhhgtgfeyxiexzf2);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5001Ujhhgtgfeyxiexzf(C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg) throws Throwable {
        if (f10857Ujhhgtgfeyxiexzf) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c3363feyxiexzfUjhhgtg);
        }
        c3363feyxiexzfUjhhgtg.f10516Ujhhgtgfeyxiexzf = ByteOrder.LITTLE_ENDIAN;
        c3363feyxiexzfUjhhgtg.m4867Ujhhgtgfeyxiexzf(f10870feyxiexzfUjhhgtg.length);
        int i = c3363feyxiexzfUjhhgtg.readInt() + 8;
        byte[] bArr = f10871feyxiexzfUjhhgtg;
        c3363feyxiexzfUjhhgtg.m4867Ujhhgtgfeyxiexzf(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c3363feyxiexzfUjhhgtg.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c3363feyxiexzfUjhhgtg.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f10872feyxiexzfUjhhgtg, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c3363feyxiexzfUjhhgtg.read(bArr3) == i2) {
                        this.f10893Ujhhgtgfeyxiexzf = i3;
                        m5006Ujhhgtgfeyxiexzf(0, bArr3);
                        m5009Ujhhgtgfeyxiexzf(new C3363feyxiexzfUjhhgtg(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC1937feyxiexzfUjhhgtg.m3273Ujhhgtgfeyxiexzf(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c3363feyxiexzfUjhhgtg.m4867Ujhhgtgfeyxiexzf(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m5002Ujhhgtgfeyxiexzf(C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg, HashMap map) throws Throwable {
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf = (C3493Ujhhgtgfeyxiexzf) map.get("JPEGInterchangeFormat");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf2 = (C3493Ujhhgtgfeyxiexzf) map.get("JPEGInterchangeFormatLength");
        if (c3493Ujhhgtgfeyxiexzf == null || c3493Ujhhgtgfeyxiexzf2 == null) {
            return;
        }
        int iM4985Ujhhgtgfeyxiexzf = c3493Ujhhgtgfeyxiexzf.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
        int iM4985Ujhhgtgfeyxiexzf2 = c3493Ujhhgtgfeyxiexzf2.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
        if (this.f10888Ujhhgtgfeyxiexzf == 7) {
            iM4985Ujhhgtgfeyxiexzf += this.f10894Ujhhgtgfeyxiexzf;
        }
        if (iM4985Ujhhgtgfeyxiexzf > 0 && iM4985Ujhhgtgfeyxiexzf2 > 0 && this.f10887Ujhhgtgfeyxiexzf == null && this.f10886Ujhhgtgfeyxiexzf == null) {
            c3363feyxiexzfUjhhgtg.skip(iM4985Ujhhgtgfeyxiexzf);
            c3363feyxiexzfUjhhgtg.read(new byte[iM4985Ujhhgtgfeyxiexzf2]);
        }
        if (f10857Ujhhgtgfeyxiexzf) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM4985Ujhhgtgfeyxiexzf + ", length: " + iM4985Ujhhgtgfeyxiexzf2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final boolean m5003Ujhhgtgfeyxiexzf(HashMap map) {
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf = (C3493Ujhhgtgfeyxiexzf) map.get("ImageLength");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf2 = (C3493Ujhhgtgfeyxiexzf) map.get("ImageWidth");
        if (c3493Ujhhgtgfeyxiexzf == null || c3493Ujhhgtgfeyxiexzf2 == null) {
            return false;
        }
        return c3493Ujhhgtgfeyxiexzf.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf) <= 512 && c3493Ujhhgtgfeyxiexzf2.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf) <= 512;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m5004Ujhhgtgfeyxiexzf(C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf) throws IOException {
        ByteOrder byteOrderM4989Ujhhgtgfeyxiexzf = m4989Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf);
        this.f10891Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf;
        c3496Ujhhgtgfeyxiexzf.f10516Ujhhgtgfeyxiexzf = byteOrderM4989Ujhhgtgfeyxiexzf;
        int unsignedShort = c3496Ujhhgtgfeyxiexzf.readUnsignedShort();
        int i = this.f10888Ujhhgtgfeyxiexzf;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c3496Ujhhgtgfeyxiexzf.readInt();
        if (i2 < 8) {
            throw new IOException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c3496Ujhhgtgfeyxiexzf.m4867Ujhhgtgfeyxiexzf(i3);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5005Ujhhgtgfeyxiexzf() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f10889Ujhhgtgfeyxiexzf;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "The size of tag group[", "]: ");
            sbM4804Ujhhgtgfeyxiexzf.append(mapArr[i].size());
            Log.d("ExifInterface", sbM4804Ujhhgtgfeyxiexzf.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf = (C3493Ujhhgtgfeyxiexzf) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c3493Ujhhgtgfeyxiexzf.toString() + ", tagValue: '" + c3493Ujhhgtgfeyxiexzf.m4986Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf) + "'");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5006Ujhhgtgfeyxiexzf(int i, byte[] bArr) throws IOException {
        C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf = new C3496Ujhhgtgfeyxiexzf(bArr);
        m5004Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf);
        m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
    /* JADX WARN: Code duplicated, block: B:108:0x0220  */
    /* JADX WARN: Code duplicated, block: B:109:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0231  */
    /* JADX WARN: Code duplicated, block: B:112:0x0238  */
    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    /* JADX WARN: Code duplicated, block: B:117:0x025a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0269  */
    /* JADX WARN: Code duplicated, block: B:121:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x028a  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02df  */
    /* JADX WARN: Code duplicated, block: B:140:0x0309  */
    /* JADX WARN: Code duplicated, block: B:167:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Code duplicated, block: B:97:0x0208  */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:120:0x0269, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x028a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0160, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01e8, please report this as an issue */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m5007Ujhhgtgfeyxiexzf(C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z;
        int i2;
        long j3;
        Integer num;
        long j4;
        String str;
        int i3;
        int unsignedShort;
        long j5;
        int i4;
        Integer numValueOf = Integer.valueOf(c3496Ujhhgtgfeyxiexzf.f10517Ujhhgtgfeyxiexzf);
        HashSet hashSet = this.f10890Ujhhgtgfeyxiexzf;
        hashSet.add(numValueOf);
        short s = c3496Ujhhgtgfeyxiexzf.readShort();
        boolean z2 = f10857Ujhhgtgfeyxiexzf;
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s));
        }
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            mapArr = this.f10889Ujhhgtgfeyxiexzf;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = c3496Ujhhgtgfeyxiexzf.readUnsignedShort();
            int unsignedShort3 = c3496Ujhhgtgfeyxiexzf.readUnsignedShort();
            int i5 = c3496Ujhhgtgfeyxiexzf.readInt();
            long j6 = ((long) c3496Ujhhgtgfeyxiexzf.f10517Ujhhgtgfeyxiexzf) + 4;
            C3494Ujhhgtgfeyxiexzf c3494Ujhhgtgfeyxiexzf = (C3494Ujhhgtgfeyxiexzf) f10879feyxiexzfUjhhgtg[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c3494Ujhhgtgfeyxiexzf != null ? c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            }
            if (c3494Ujhhgtgfeyxiexzf != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f10874feyxiexzfUjhhgtg;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = c3494Ujhhgtgfeyxiexzf.f10853Ujhhgtgfeyxiexzf;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = c3494Ujhhgtgfeyxiexzf.f10854Ujhhgtgfeyxiexzf) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i6;
                            }
                            j = j6;
                            j2 = ((long) i5) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i5);
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f10873feyxiexzfUjhhgtg[unsignedShort3] + ") is unexpected for tag: " + c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf);
                        }
                    }
                    if (z) {
                        j3 = j;
                        if (j2 > 4) {
                            i4 = c3496Ujhhgtgfeyxiexzf.readInt();
                            if (z2 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i4);
                            }
                            if (this.f10888Ujhhgtgfeyxiexzf == 7) {
                                if ("MakerNote".equals(c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf)) {
                                    this.f10894Ujhhgtgfeyxiexzf = i4;
                                } else if (i != 6 && "ThumbnailImage".equals(c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf)) {
                                    this.f10895Ujhhgtgfeyxiexzf = i4;
                                    this.f10896Ujhhgtgfeyxiexzf = i5;
                                    C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf = C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(6, this.f10891Ujhhgtgfeyxiexzf);
                                    C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4981Ujhhgtgfeyxiexzf = C3493Ujhhgtgfeyxiexzf.m4981Ujhhgtgfeyxiexzf(this.f10895Ujhhgtgfeyxiexzf, this.f10891Ujhhgtgfeyxiexzf);
                                    C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4981Ujhhgtgfeyxiexzf2 = C3493Ujhhgtgfeyxiexzf.m4981Ujhhgtgfeyxiexzf(this.f10896Ujhhgtgfeyxiexzf, this.f10891Ujhhgtgfeyxiexzf);
                                    mapArr[4].put("Compression", c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf);
                                    mapArr[4].put("JPEGInterchangeFormat", c3493UjhhgtgfeyxiexzfM4981Ujhhgtgfeyxiexzf);
                                    mapArr[4].put("JPEGInterchangeFormatLength", c3493UjhhgtgfeyxiexzfM4981Ujhhgtgfeyxiexzf2);
                                }
                            }
                            c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(i4);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            unsignedShort3 = unsignedShort3;
                        }
                        num = (Integer) f10882feyxiexzfUjhhgtg.get(Integer.valueOf(unsignedShort2));
                        if (z2 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            i3 = unsignedShort3;
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    j5 = ((long) c3496Ujhhgtgfeyxiexzf.readInt()) & 4294967295L;
                                } else if (i3 == 8) {
                                    unsignedShort = c3496Ujhhgtgfeyxiexzf.readShort();
                                } else if (i3 != 9 || i3 == 13) {
                                    unsignedShort = c3496Ujhhgtgfeyxiexzf.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z2 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf));
                                }
                                if (j5 > 0) {
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j5);
                                        m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, num.intValue());
                                    } else if (z2 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                                }
                                c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j3);
                            } else {
                                unsignedShort = c3496Ujhhgtgfeyxiexzf.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j5);
                                    m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, num.intValue());
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j3);
                        } else {
                            j4 = j3;
                            int i7 = c3496Ujhhgtgfeyxiexzf.f10517Ujhhgtgfeyxiexzf + this.f10893Ujhhgtgfeyxiexzf;
                            byte[] bArr = new byte[(int) j2];
                            c3496Ujhhgtgfeyxiexzf.readFully(bArr);
                            C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf = new C3493Ujhhgtgfeyxiexzf(i7, bArr, unsignedShort3, i5);
                            HashMap map = mapArr[i];
                            str = c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf;
                            map.put(str, c3493Ujhhgtgfeyxiexzf);
                            if ("DNGVersion".equals(str)) {
                                this.f10888Ujhhgtgfeyxiexzf = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && c3493Ujhhgtgfeyxiexzf.m4986Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf).contains("PENTAX")) || ("Compression".equals(str) && c3493Ujhhgtgfeyxiexzf.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf) == 65535)) {
                                this.f10888Ujhhgtgfeyxiexzf = 8;
                            }
                            if (c3496Ujhhgtgfeyxiexzf.f10517Ujhhgtgfeyxiexzf != j4) {
                                c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j4);
                            }
                        }
                    } else {
                        c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j);
                    }
                    s2 = (short) (s2 + 1);
                    s = s;
                    z2 = z2;
                }
                j = j6;
                if (z2 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z = false;
                if (z) {
                    c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j);
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i4 = c3496Ujhhgtgfeyxiexzf.readInt();
                        if (z2 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i4);
                        }
                        if (this.f10888Ujhhgtgfeyxiexzf == 7) {
                            if ("MakerNote".equals(c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf)) {
                                this.f10894Ujhhgtgfeyxiexzf = i4;
                            } else if (i != 6) {
                            }
                        }
                        c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(i4);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        unsignedShort3 = unsignedShort3;
                    }
                    num = (Integer) f10882feyxiexzfUjhhgtg.get(Integer.valueOf(unsignedShort2));
                    if (z2 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        i3 = unsignedShort3;
                        if (i3 != 3) {
                            if (i3 == 4) {
                                j5 = ((long) c3496Ujhhgtgfeyxiexzf.readInt()) & 4294967295L;
                            } else if (i3 == 8) {
                                if (i3 != 9) {
                                }
                                unsignedShort = c3496Ujhhgtgfeyxiexzf.readInt();
                            } else {
                                unsignedShort = c3496Ujhhgtgfeyxiexzf.readShort();
                            }
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j5);
                                    m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, num.intValue());
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j3);
                        } else {
                            unsignedShort = c3496Ujhhgtgfeyxiexzf.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j5);
                                m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, num.intValue());
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j3);
                    } else {
                        j4 = j3;
                        int i8 = c3496Ujhhgtgfeyxiexzf.f10517Ujhhgtgfeyxiexzf + this.f10893Ujhhgtgfeyxiexzf;
                        byte[] bArr2 = new byte[(int) j2];
                        c3496Ujhhgtgfeyxiexzf.readFully(bArr2);
                        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf2 = new C3493Ujhhgtgfeyxiexzf(i8, bArr2, unsignedShort3, i5);
                        HashMap map2 = mapArr[i];
                        str = c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf;
                        map2.put(str, c3493Ujhhgtgfeyxiexzf2);
                        if ("DNGVersion".equals(str)) {
                            this.f10888Ujhhgtgfeyxiexzf = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f10888Ujhhgtgfeyxiexzf = 8;
                        if (c3496Ujhhgtgfeyxiexzf.f10517Ujhhgtgfeyxiexzf != j4) {
                            c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j4);
                        }
                    }
                }
                s2 = (short) (s2 + 1);
                s = s;
                z2 = z2;
            } else if (z2) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z = false;
            if (z) {
                c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j);
            } else {
                j3 = j;
                if (j2 > 4) {
                    i4 = c3496Ujhhgtgfeyxiexzf.readInt();
                    if (z2 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i4);
                    }
                    if (this.f10888Ujhhgtgfeyxiexzf == 7) {
                        if ("MakerNote".equals(c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf)) {
                            this.f10894Ujhhgtgfeyxiexzf = i4;
                        } else if (i != 6) {
                        }
                    }
                    c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(i4);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    unsignedShort3 = unsignedShort3;
                }
                num = (Integer) f10882feyxiexzfUjhhgtg.get(Integer.valueOf(unsignedShort2));
                if (z2 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    i3 = unsignedShort3;
                    if (i3 != 3) {
                        if (i3 == 4) {
                            j5 = ((long) c3496Ujhhgtgfeyxiexzf.readInt()) & 4294967295L;
                        } else if (i3 == 8) {
                            if (i3 != 9) {
                            }
                            unsignedShort = c3496Ujhhgtgfeyxiexzf.readInt();
                        } else {
                            unsignedShort = c3496Ujhhgtgfeyxiexzf.readShort();
                        }
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j5);
                                m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, num.intValue());
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j3);
                    } else {
                        unsignedShort = c3496Ujhhgtgfeyxiexzf.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z2 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf));
                    }
                    if (j5 > 0) {
                        if (!hashSet.contains(Integer.valueOf((int) j5))) {
                            c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j5);
                            m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, num.intValue());
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                        }
                    } else if (z2 != 0) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                    }
                    c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j3);
                } else {
                    j4 = j3;
                    int i9 = c3496Ujhhgtgfeyxiexzf.f10517Ujhhgtgfeyxiexzf + this.f10893Ujhhgtgfeyxiexzf;
                    byte[] bArr3 = new byte[(int) j2];
                    c3496Ujhhgtgfeyxiexzf.readFully(bArr3);
                    C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf3 = new C3493Ujhhgtgfeyxiexzf(i9, bArr3, unsignedShort3, i5);
                    HashMap map3 = mapArr[i];
                    str = c3494Ujhhgtgfeyxiexzf.f10852Ujhhgtgfeyxiexzf;
                    map3.put(str, c3493Ujhhgtgfeyxiexzf3);
                    if ("DNGVersion".equals(str)) {
                        this.f10888Ujhhgtgfeyxiexzf = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f10888Ujhhgtgfeyxiexzf = 8;
                    if (c3496Ujhhgtgfeyxiexzf.f10517Ujhhgtgfeyxiexzf != j4) {
                        c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j4);
                    }
                }
            }
            s2 = (short) (s2 + 1);
            s = s;
            z2 = z2;
        }
        boolean z3 = z2;
        int i10 = c3496Ujhhgtgfeyxiexzf.readInt();
        if (z3) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i10)));
        }
        long j7 = i10;
        if (j7 <= 0) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(i10))) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(j7);
        if (mapArr[4].isEmpty()) {
            m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, 4);
        } else if (mapArr[5].isEmpty()) {
            m5007Ujhhgtgfeyxiexzf(c3496Ujhhgtgfeyxiexzf, 5);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final void m5008Ujhhgtgfeyxiexzf(int i, String str, String str2) {
        HashMap[] mapArr = this.f10889Ujhhgtgfeyxiexzf;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m5009Ujhhgtgfeyxiexzf(C3363feyxiexzfUjhhgtg c3363feyxiexzfUjhhgtg) throws Throwable {
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf;
        int iM4985Ujhhgtgfeyxiexzf;
        HashMap map = this.f10889Ujhhgtgfeyxiexzf[4];
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf2 = (C3493Ujhhgtgfeyxiexzf) map.get("Compression");
        if (c3493Ujhhgtgfeyxiexzf2 == null) {
            m5002Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg, map);
            return;
        }
        int iM4985Ujhhgtgfeyxiexzf2 = c3493Ujhhgtgfeyxiexzf2.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
        if (iM4985Ujhhgtgfeyxiexzf2 != 1) {
            if (iM4985Ujhhgtgfeyxiexzf2 == 6) {
                m5002Ujhhgtgfeyxiexzf(c3363feyxiexzfUjhhgtg, map);
                return;
            } else if (iM4985Ujhhgtgfeyxiexzf2 != 7) {
                return;
            }
        }
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf3 = (C3493Ujhhgtgfeyxiexzf) map.get("BitsPerSample");
        if (c3493Ujhhgtgfeyxiexzf3 != null) {
            int[] iArr = (int[]) c3493Ujhhgtgfeyxiexzf3.m4987Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
            int[] iArr2 = f10858Ujhhgtgfeyxiexzf;
            if (Arrays.equals(iArr2, iArr) || (this.f10888Ujhhgtgfeyxiexzf == 3 && (c3493Ujhhgtgfeyxiexzf = (C3493Ujhhgtgfeyxiexzf) map.get("PhotometricInterpretation")) != null && (((iM4985Ujhhgtgfeyxiexzf = c3493Ujhhgtgfeyxiexzf.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf)) == 1 && Arrays.equals(iArr, f10859Ujhhgtgfeyxiexzf)) || (iM4985Ujhhgtgfeyxiexzf == 6 && Arrays.equals(iArr, iArr2))))) {
                C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf4 = (C3493Ujhhgtgfeyxiexzf) map.get("StripOffsets");
                C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf5 = (C3493Ujhhgtgfeyxiexzf) map.get("StripByteCounts");
                if (c3493Ujhhgtgfeyxiexzf4 == null || c3493Ujhhgtgfeyxiexzf5 == null) {
                    return;
                }
                long[] jArrM3275Ujhhgtgfeyxiexzf = AbstractC1937feyxiexzfUjhhgtg.m3275Ujhhgtgfeyxiexzf(c3493Ujhhgtgfeyxiexzf4.m4987Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf));
                long[] jArrM3275Ujhhgtgfeyxiexzf2 = AbstractC1937feyxiexzfUjhhgtg.m3275Ujhhgtgfeyxiexzf(c3493Ujhhgtgfeyxiexzf5.m4987Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf));
                if (jArrM3275Ujhhgtgfeyxiexzf == null || jArrM3275Ujhhgtgfeyxiexzf.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM3275Ujhhgtgfeyxiexzf2 == null || jArrM3275Ujhhgtgfeyxiexzf2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM3275Ujhhgtgfeyxiexzf.length != jArrM3275Ujhhgtgfeyxiexzf2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM3275Ujhhgtgfeyxiexzf2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f10892Ujhhgtgfeyxiexzf = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM3275Ujhhgtgfeyxiexzf.length; i3++) {
                    int i4 = (int) jArrM3275Ujhhgtgfeyxiexzf[i3];
                    int i5 = (int) jArrM3275Ujhhgtgfeyxiexzf2[i3];
                    if (i3 < jArrM3275Ujhhgtgfeyxiexzf.length - 1 && i4 + i5 != jArrM3275Ujhhgtgfeyxiexzf[i3 + 1]) {
                        this.f10892Ujhhgtgfeyxiexzf = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (c3363feyxiexzfUjhhgtg.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (c3363feyxiexzfUjhhgtg.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.f10892Ujhhgtgfeyxiexzf) {
                    long j4 = jArrM3275Ujhhgtgfeyxiexzf[0];
                    return;
                }
                return;
            }
        }
        if (f10857Ujhhgtgfeyxiexzf) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5010Ujhhgtgfeyxiexzf(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f10889Ujhhgtgfeyxiexzf;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f10857Ujhhgtgfeyxiexzf;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf = (C3493Ujhhgtgfeyxiexzf) mapArr[i].get("ImageLength");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf2 = (C3493Ujhhgtgfeyxiexzf) mapArr[i].get("ImageWidth");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf3 = (C3493Ujhhgtgfeyxiexzf) mapArr[i2].get("ImageLength");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf4 = (C3493Ujhhgtgfeyxiexzf) mapArr[i2].get("ImageWidth");
        if (c3493Ujhhgtgfeyxiexzf == null || c3493Ujhhgtgfeyxiexzf2 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c3493Ujhhgtgfeyxiexzf3 == null || c3493Ujhhgtgfeyxiexzf4 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM4985Ujhhgtgfeyxiexzf = c3493Ujhhgtgfeyxiexzf.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
        int iM4985Ujhhgtgfeyxiexzf2 = c3493Ujhhgtgfeyxiexzf2.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
        int iM4985Ujhhgtgfeyxiexzf3 = c3493Ujhhgtgfeyxiexzf3.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
        int iM4985Ujhhgtgfeyxiexzf4 = c3493Ujhhgtgfeyxiexzf4.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
        if (iM4985Ujhhgtgfeyxiexzf >= iM4985Ujhhgtgfeyxiexzf3 || iM4985Ujhhgtgfeyxiexzf2 >= iM4985Ujhhgtgfeyxiexzf4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void m5011Ujhhgtgfeyxiexzf(C3496Ujhhgtgfeyxiexzf c3496Ujhhgtgfeyxiexzf, int i) throws Throwable {
        C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf;
        C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf2;
        HashMap[] mapArr = this.f10889Ujhhgtgfeyxiexzf;
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf = (C3493Ujhhgtgfeyxiexzf) mapArr[i].get("DefaultCropSize");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf2 = (C3493Ujhhgtgfeyxiexzf) mapArr[i].get("SensorTopBorder");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf3 = (C3493Ujhhgtgfeyxiexzf) mapArr[i].get("SensorLeftBorder");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf4 = (C3493Ujhhgtgfeyxiexzf) mapArr[i].get("SensorBottomBorder");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf5 = (C3493Ujhhgtgfeyxiexzf) mapArr[i].get("SensorRightBorder");
        if (c3493Ujhhgtgfeyxiexzf != null) {
            if (c3493Ujhhgtgfeyxiexzf.f10847Ujhhgtgfeyxiexzf == 5) {
                C3495Ujhhgtgfeyxiexzf[] c3495UjhhgtgfeyxiexzfArr = (C3495Ujhhgtgfeyxiexzf[]) c3493Ujhhgtgfeyxiexzf.m4987Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
                if (c3495UjhhgtgfeyxiexzfArr == null || c3495UjhhgtgfeyxiexzfArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c3495UjhhgtgfeyxiexzfArr));
                    return;
                }
                c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf = C3493Ujhhgtgfeyxiexzf.m4982Ujhhgtgfeyxiexzf(c3495UjhhgtgfeyxiexzfArr[0], this.f10891Ujhhgtgfeyxiexzf);
                c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf2 = C3493Ujhhgtgfeyxiexzf.m4982Ujhhgtgfeyxiexzf(c3495UjhhgtgfeyxiexzfArr[1], this.f10891Ujhhgtgfeyxiexzf);
            } else {
                int[] iArr = (int[]) c3493Ujhhgtgfeyxiexzf.m4987Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf = C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(iArr[0], this.f10891Ujhhgtgfeyxiexzf);
                c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf2 = C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(iArr[1], this.f10891Ujhhgtgfeyxiexzf);
            }
            mapArr[i].put("ImageWidth", c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf);
            mapArr[i].put("ImageLength", c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf2);
            return;
        }
        if (c3493Ujhhgtgfeyxiexzf2 != null && c3493Ujhhgtgfeyxiexzf3 != null && c3493Ujhhgtgfeyxiexzf4 != null && c3493Ujhhgtgfeyxiexzf5 != null) {
            int iM4985Ujhhgtgfeyxiexzf = c3493Ujhhgtgfeyxiexzf2.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
            int iM4985Ujhhgtgfeyxiexzf2 = c3493Ujhhgtgfeyxiexzf4.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
            int iM4985Ujhhgtgfeyxiexzf3 = c3493Ujhhgtgfeyxiexzf5.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
            int iM4985Ujhhgtgfeyxiexzf4 = c3493Ujhhgtgfeyxiexzf3.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
            if (iM4985Ujhhgtgfeyxiexzf2 <= iM4985Ujhhgtgfeyxiexzf || iM4985Ujhhgtgfeyxiexzf3 <= iM4985Ujhhgtgfeyxiexzf4) {
                return;
            }
            C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf3 = C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(iM4985Ujhhgtgfeyxiexzf2 - iM4985Ujhhgtgfeyxiexzf, this.f10891Ujhhgtgfeyxiexzf);
            C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf4 = C3493Ujhhgtgfeyxiexzf.m4983Ujhhgtgfeyxiexzf(iM4985Ujhhgtgfeyxiexzf3 - iM4985Ujhhgtgfeyxiexzf4, this.f10891Ujhhgtgfeyxiexzf);
            mapArr[i].put("ImageLength", c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf3);
            mapArr[i].put("ImageWidth", c3493UjhhgtgfeyxiexzfM4983Ujhhgtgfeyxiexzf4);
            return;
        }
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf6 = (C3493Ujhhgtgfeyxiexzf) mapArr[i].get("ImageLength");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf7 = (C3493Ujhhgtgfeyxiexzf) mapArr[i].get("ImageWidth");
        if (c3493Ujhhgtgfeyxiexzf6 == null || c3493Ujhhgtgfeyxiexzf7 == null) {
            C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf8 = (C3493Ujhhgtgfeyxiexzf) mapArr[i].get("JPEGInterchangeFormat");
            C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf9 = (C3493Ujhhgtgfeyxiexzf) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c3493Ujhhgtgfeyxiexzf8 == null || c3493Ujhhgtgfeyxiexzf9 == null) {
                return;
            }
            int iM4985Ujhhgtgfeyxiexzf5 = c3493Ujhhgtgfeyxiexzf8.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
            int iM4985Ujhhgtgfeyxiexzf6 = c3493Ujhhgtgfeyxiexzf8.m4985Ujhhgtgfeyxiexzf(this.f10891Ujhhgtgfeyxiexzf);
            c3496Ujhhgtgfeyxiexzf.m4988Ujhhgtgfeyxiexzf(iM4985Ujhhgtgfeyxiexzf5);
            byte[] bArr = new byte[iM4985Ujhhgtgfeyxiexzf6];
            c3496Ujhhgtgfeyxiexzf.read(bArr);
            m4994Ujhhgtgfeyxiexzf(new C3363feyxiexzfUjhhgtg(bArr), iM4985Ujhhgtgfeyxiexzf5, i);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m5012Ujhhgtgfeyxiexzf() throws Throwable {
        m5010Ujhhgtgfeyxiexzf(0, 5);
        m5010Ujhhgtgfeyxiexzf(0, 4);
        m5010Ujhhgtgfeyxiexzf(5, 4);
        HashMap[] mapArr = this.f10889Ujhhgtgfeyxiexzf;
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf = (C3493Ujhhgtgfeyxiexzf) mapArr[1].get("PixelXDimension");
        C3493Ujhhgtgfeyxiexzf c3493Ujhhgtgfeyxiexzf2 = (C3493Ujhhgtgfeyxiexzf) mapArr[1].get("PixelYDimension");
        if (c3493Ujhhgtgfeyxiexzf != null && c3493Ujhhgtgfeyxiexzf2 != null) {
            mapArr[0].put("ImageWidth", c3493Ujhhgtgfeyxiexzf);
            mapArr[0].put("ImageLength", c3493Ujhhgtgfeyxiexzf2);
        }
        if (mapArr[4].isEmpty() && m5003Ujhhgtgfeyxiexzf(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m5003Ujhhgtgfeyxiexzf(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m5008Ujhhgtgfeyxiexzf(0, "ThumbnailOrientation", "Orientation");
        m5008Ujhhgtgfeyxiexzf(0, "ThumbnailImageLength", "ImageLength");
        m5008Ujhhgtgfeyxiexzf(0, "ThumbnailImageWidth", "ImageWidth");
        m5008Ujhhgtgfeyxiexzf(5, "ThumbnailOrientation", "Orientation");
        m5008Ujhhgtgfeyxiexzf(5, "ThumbnailImageLength", "ImageLength");
        m5008Ujhhgtgfeyxiexzf(5, "ThumbnailImageWidth", "ImageWidth");
        m5008Ujhhgtgfeyxiexzf(4, "Orientation", "ThumbnailOrientation");
        m5008Ujhhgtgfeyxiexzf(4, "ImageLength", "ThumbnailImageLength");
        m5008Ujhhgtgfeyxiexzf(4, "ImageWidth", "ThumbnailImageWidth");
    }
}

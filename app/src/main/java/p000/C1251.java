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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᤞᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1251 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final boolean f4529 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final int[] f4530;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final int[] f4531;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final byte[] f4532;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final byte[] f4533;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final byte[] f4534;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final byte[] f4535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final byte[] f4536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final byte[] f4537;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final byte[] f4538;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final byte[] f4539;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static final byte[] f4540;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static final byte[] f4541;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final byte[] f4542;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f4543;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final byte[] f4544;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final String[] f4545;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static final int[] f4546;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static final byte[] f4547;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final C1248 f4548;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static final C1248[][] f4549;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static final C1248[] f4550;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static final HashMap[] f4551;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static final HashMap[] f4552;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static final HashSet f4553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static final HashMap f4554;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static final Charset f4555;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static final byte[] f4556;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static final byte[] f4557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final FileDescriptor f4558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AssetManager.AssetInputStream f4559;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f4560;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final HashMap[] f4561;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final HashSet f4562;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public ByteOrder f4563;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f4564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f4565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f4566;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f4567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f4568;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f4530 = new int[]{8, 8, 8};
        f4531 = new int[]{8};
        f4532 = new byte[]{-1, JSONB.Constants.BC_INT64_NUM_MIN, -1};
        f4533 = new byte[]{102, 116, JSONB.Constants.BC_STR_ASCII, 112};
        f4534 = new byte[]{JSONB.Constants.BC_STR_ASCII_FIX_36, JSONB.Constants.BC_STR_ASCII_FIX_32, 102, 49};
        f4535 = new byte[]{104, 101, JSONB.Constants.BC_STR_ASCII_FIX_32, 99};
        f4536 = new byte[]{79, 76, 89, JSONB.Constants.BC_STR_ASCII_FIX_4, 80, 0};
        f4537 = new byte[]{79, 76, 89, JSONB.Constants.BC_STR_ASCII_FIX_4, 80, 85, 83, 0, 73, 73};
        f4538 = new byte[]{-119, 80, JSONB.Constants.BC_STR_ASCII_FIX_5, JSONB.Constants.BC_INT32_SHORT_MAX, ek.k, 10, 26, 10};
        f4539 = new byte[]{101, 88, 73, 102};
        f4540 = new byte[]{73, JSONB.Constants.BC_INT32, JSONB.Constants.BC_INT32_SHORT_ZERO, 82};
        f4541 = new byte[]{73, 69, JSONB.Constants.BC_STR_ASCII_FIX_5, JSONB.Constants.BC_INT32_SHORT_ZERO};
        f4542 = new byte[]{82, 73, 70, 70};
        f4543 = new byte[]{87, 69, 66, 80};
        f4544 = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f4545 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f4546 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f4547 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C1248[] c1248Arr = {new C1248("NewSubfileType", 254, 4), new C1248("SubfileType", 255, 4), new C1248(bc.e, "ImageWidth", 3, 4), new C1248(257, "ImageLength", 3, 4), new C1248("BitsPerSample", 258, 3), new C1248("Compression", 259, 3), new C1248("PhotometricInterpretation", 262, 3), new C1248("ImageDescription", 270, 2), new C1248("Make", 271, 2), new C1248("Model", 272, 2), new C1248(b.a, "StripOffsets", 3, 4), new C1248("Orientation", 274, 3), new C1248("SamplesPerPixel", 277, 3), new C1248(278, "RowsPerStrip", 3, 4), new C1248(279, "StripByteCounts", 3, 4), new C1248("XResolution", 282, 5), new C1248("YResolution", 283, 5), new C1248("PlanarConfiguration", 284, 3), new C1248("ResolutionUnit", 296, 3), new C1248("TransferFunction", c.p, 3), new C1248("Software", 305, 2), new C1248("DateTime", 306, 2), new C1248("Artist", 315, 2), new C1248("WhitePoint", 318, 5), new C1248("PrimaryChromaticities", 319, 5), new C1248("SubIFDPointer", 330, 4), new C1248("JPEGInterchangeFormat", 513, 4), new C1248("JPEGInterchangeFormatLength", 514, 4), new C1248("YCbCrCoefficients", 529, 5), new C1248("YCbCrSubSampling", 530, 3), new C1248("YCbCrPositioning", 531, 3), new C1248("ReferenceBlackWhite", 532, 5), new C1248("Copyright", 33432, 2), new C1248("ExifIFDPointer", 34665, 4), new C1248("GPSInfoIFDPointer", 34853, 4), new C1248("SensorTopBorder", 4, 4), new C1248("SensorLeftBorder", 5, 4), new C1248("SensorBottomBorder", 6, 4), new C1248("SensorRightBorder", 7, 4), new C1248("ISO", 23, 3), new C1248("JpgFromRaw", 46, 7), new C1248("Xmp", 700, 1)};
        C1248[] c1248Arr2 = {new C1248("ExposureTime", 33434, 5), new C1248("FNumber", 33437, 5), new C1248("ExposureProgram", 34850, 3), new C1248("SpectralSensitivity", 34852, 2), new C1248("PhotographicSensitivity", 34855, 3), new C1248("OECF", 34856, 7), new C1248("SensitivityType", 34864, 3), new C1248("StandardOutputSensitivity", 34865, 4), new C1248("RecommendedExposureIndex", 34866, 4), new C1248("ISOSpeed", 34867, 4), new C1248("ISOSpeedLatitudeyyy", 34868, 4), new C1248("ISOSpeedLatitudezzz", 34869, 4), new C1248("ExifVersion", 36864, 2), new C1248("DateTimeOriginal", 36867, 2), new C1248("DateTimeDigitized", 36868, 2), new C1248("OffsetTime", 36880, 2), new C1248("OffsetTimeOriginal", 36881, 2), new C1248("OffsetTimeDigitized", 36882, 2), new C1248("ComponentsConfiguration", 37121, 7), new C1248("CompressedBitsPerPixel", 37122, 5), new C1248("ShutterSpeedValue", 37377, 10), new C1248("ApertureValue", 37378, 5), new C1248("BrightnessValue", 37379, 10), new C1248("ExposureBiasValue", 37380, 10), new C1248("MaxApertureValue", 37381, 5), new C1248("SubjectDistance", 37382, 5), new C1248("MeteringMode", 37383, 3), new C1248("LightSource", 37384, 3), new C1248("Flash", 37385, 3), new C1248("FocalLength", 37386, 5), new C1248("SubjectArea", 37396, 3), new C1248("MakerNote", 37500, 7), new C1248("UserComment", 37510, 7), new C1248("SubSecTime", 37520, 2), new C1248("SubSecTimeOriginal", 37521, 2), new C1248("SubSecTimeDigitized", 37522, 2), new C1248("FlashpixVersion", 40960, 7), new C1248("ColorSpace", 40961, 3), new C1248(40962, "PixelXDimension", 3, 4), new C1248(40963, "PixelYDimension", 3, 4), new C1248("RelatedSoundFile", 40964, 2), new C1248("InteroperabilityIFDPointer", 40965, 4), new C1248("FlashEnergy", 41483, 5), new C1248("SpatialFrequencyResponse", 41484, 7), new C1248("FocalPlaneXResolution", 41486, 5), new C1248("FocalPlaneYResolution", 41487, 5), new C1248("FocalPlaneResolutionUnit", 41488, 3), new C1248("SubjectLocation", 41492, 3), new C1248("ExposureIndex", 41493, 5), new C1248("SensingMethod", 41495, 3), new C1248("FileSource", 41728, 7), new C1248("SceneType", 41729, 7), new C1248("CFAPattern", 41730, 7), new C1248("CustomRendered", 41985, 3), new C1248("ExposureMode", 41986, 3), new C1248("WhiteBalance", 41987, 3), new C1248("DigitalZoomRatio", 41988, 5), new C1248("FocalLengthIn35mmFilm", 41989, 3), new C1248("SceneCaptureType", 41990, 3), new C1248("GainControl", 41991, 3), new C1248("Contrast", 41992, 3), new C1248("Saturation", 41993, 3), new C1248("Sharpness", 41994, 3), new C1248("DeviceSettingDescription", 41995, 7), new C1248("SubjectDistanceRange", 41996, 3), new C1248("ImageUniqueID", 42016, 2), new C1248("CameraOwnerName", 42032, 2), new C1248("BodySerialNumber", 42033, 2), new C1248("LensSpecification", 42034, 5), new C1248("LensMake", 42035, 2), new C1248("LensModel", 42036, 2), new C1248("Gamma", 42240, 5), new C1248("DNGVersion", 50706, 1), new C1248(50720, "DefaultCropSize", 3, 4)};
        C1248[] c1248Arr3 = {new C1248("GPSVersionID", 0, 1), new C1248("GPSLatitudeRef", 1, 2), new C1248(2, "GPSLatitude", 5, 10), new C1248("GPSLongitudeRef", 3, 2), new C1248(4, "GPSLongitude", 5, 10), new C1248("GPSAltitudeRef", 5, 1), new C1248("GPSAltitude", 6, 5), new C1248("GPSTimeStamp", 7, 5), new C1248("GPSSatellites", 8, 2), new C1248("GPSStatus", 9, 2), new C1248("GPSMeasureMode", 10, 2), new C1248("GPSDOP", 11, 5), new C1248("GPSSpeedRef", 12, 2), new C1248("GPSSpeed", 13, 5), new C1248("GPSTrackRef", 14, 2), new C1248("GPSTrack", 15, 5), new C1248("GPSImgDirectionRef", 16, 2), new C1248("GPSImgDirection", 17, 5), new C1248("GPSMapDatum", 18, 2), new C1248("GPSDestLatitudeRef", 19, 2), new C1248("GPSDestLatitude", 20, 5), new C1248("GPSDestLongitudeRef", 21, 2), new C1248("GPSDestLongitude", 22, 5), new C1248("GPSDestBearingRef", 23, 2), new C1248("GPSDestBearing", 24, 5), new C1248("GPSDestDistanceRef", 25, 2), new C1248("GPSDestDistance", 26, 5), new C1248("GPSProcessingMethod", 27, 7), new C1248("GPSAreaInformation", 28, 7), new C1248("GPSDateStamp", 29, 2), new C1248("GPSDifferential", 30, 3), new C1248("GPSHPositioningError", 31, 5)};
        C1248[] c1248Arr4 = {new C1248("InteroperabilityIndex", 1, 2)};
        C1248[] c1248Arr5 = {new C1248("NewSubfileType", 254, 4), new C1248("SubfileType", 255, 4), new C1248(bc.e, "ThumbnailImageWidth", 3, 4), new C1248(257, "ThumbnailImageLength", 3, 4), new C1248("BitsPerSample", 258, 3), new C1248("Compression", 259, 3), new C1248("PhotometricInterpretation", 262, 3), new C1248("ImageDescription", 270, 2), new C1248("Make", 271, 2), new C1248("Model", 272, 2), new C1248(b.a, "StripOffsets", 3, 4), new C1248("ThumbnailOrientation", 274, 3), new C1248("SamplesPerPixel", 277, 3), new C1248(278, "RowsPerStrip", 3, 4), new C1248(279, "StripByteCounts", 3, 4), new C1248("XResolution", 282, 5), new C1248("YResolution", 283, 5), new C1248("PlanarConfiguration", 284, 3), new C1248("ResolutionUnit", 296, 3), new C1248("TransferFunction", c.p, 3), new C1248("Software", 305, 2), new C1248("DateTime", 306, 2), new C1248("Artist", 315, 2), new C1248("WhitePoint", 318, 5), new C1248("PrimaryChromaticities", 319, 5), new C1248("SubIFDPointer", 330, 4), new C1248("JPEGInterchangeFormat", 513, 4), new C1248("JPEGInterchangeFormatLength", 514, 4), new C1248("YCbCrCoefficients", 529, 5), new C1248("YCbCrSubSampling", 530, 3), new C1248("YCbCrPositioning", 531, 3), new C1248("ReferenceBlackWhite", 532, 5), new C1248("Copyright", 33432, 2), new C1248("ExifIFDPointer", 34665, 4), new C1248("GPSInfoIFDPointer", 34853, 4), new C1248("DNGVersion", 50706, 1), new C1248(50720, "DefaultCropSize", 3, 4)};
        f4548 = new C1248("StripOffsets", b.a, 3);
        f4549 = new C1248[][]{c1248Arr, c1248Arr2, c1248Arr3, c1248Arr4, c1248Arr5, c1248Arr, new C1248[]{new C1248("ThumbnailImage", bc.e, 7), new C1248("CameraSettingsIFDPointer", 8224, 4), new C1248("ImageProcessingIFDPointer", 8256, 4)}, new C1248[]{new C1248("PreviewImageStart", 257, 4), new C1248("PreviewImageLength", 258, 4)}, new C1248[]{new C1248("AspectFrame", 4371, 3)}, new C1248[]{new C1248("ColorSpace", 55, 3)}};
        f4550 = new C1248[]{new C1248("SubIFDPointer", 330, 4), new C1248("ExifIFDPointer", 34665, 4), new C1248("GPSInfoIFDPointer", 34853, 4), new C1248("InteroperabilityIFDPointer", 40965, 4), new C1248("CameraSettingsIFDPointer", 8224, 1), new C1248("ImageProcessingIFDPointer", 8256, 1)};
        f4551 = new HashMap[10];
        f4552 = new HashMap[10];
        f4553 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f4554 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f4555 = charsetForName;
        f4556 = "Exif\u0000\u0000".getBytes(charsetForName);
        f4557 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C1248[][] c1248Arr6 = f4549;
            if (i >= c1248Arr6.length) {
                HashMap map = f4554;
                C1248[] c1248Arr7 = f4550;
                map.put(Integer.valueOf(c1248Arr7[0].f4523), 5);
                map.put(Integer.valueOf(c1248Arr7[1].f4523), 1);
                map.put(Integer.valueOf(c1248Arr7[2].f4523), 2);
                map.put(Integer.valueOf(c1248Arr7[3].f4523), 3);
                map.put(Integer.valueOf(c1248Arr7[4].f4523), 7);
                map.put(Integer.valueOf(c1248Arr7[5].f4523), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f4551[i] = new HashMap();
            f4552[i] = new HashMap();
            for (C1248 c1248 : c1248Arr6[i]) {
                f4551[i].put(Integer.valueOf(c1248.f4523), c1248);
                f4552[i].put(c1248.f4524, c1248);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public C1251(InputStream inputStream) throws IOException {
        C1248[][] c1248Arr = f4549;
        this.f4561 = new HashMap[c1248Arr.length];
        this.f4562 = new HashSet(c1248Arr.length);
        this.f4563 = ByteOrder.BIG_ENDIAN;
        boolean z = inputStream instanceof AssetManager.AssetInputStream;
        boolean z2 = f4529;
        if (z) {
            this.f4559 = (AssetManager.AssetInputStream) inputStream;
            this.f4558 = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC1253.m2938(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f4559 = null;
                this.f4558 = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z2) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f4559 = null;
                this.f4558 = null;
            }
        } else {
            this.f4559 = null;
            this.f4558 = null;
        }
        for (int i = 0; i < c1248Arr.length; i++) {
            try {
                try {
                    this.f4561[i] = new HashMap();
                } catch (Throwable th) {
                    m2913();
                    if (z2) {
                        m2928();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m2913();
                if (!z2) {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m2913();
                if (!z2) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM2918 = m2918(bufferedInputStream);
        this.f4560 = iM2918;
        if (iM2918 == 4 || iM2918 == 9 || iM2918 == 13 || iM2918 == 14) {
            C1246 c1246 = new C1246(bufferedInputStream);
            int i2 = this.f4560;
            if (i2 == 4) {
                m2917(c1246, 0, 0);
            } else if (i2 == 13) {
                m2920(c1246);
            } else if (i2 == 9) {
                m2921(c1246);
            } else if (i2 == 14) {
                m2924(c1246);
            }
        } else {
            C1250 c1250 = new C1250(bufferedInputStream);
            int i3 = this.f4560;
            if (i3 == 12) {
                m2916(c1250);
            } else if (i3 == 7) {
                m2919(c1250);
            } else if (i3 == 10) {
                m2923(c1250);
            } else {
                m2922(c1250);
            }
            c1250.m2911(this.f4565);
            m2932(c1250);
        }
        m2913();
        if (!z2) {
            return;
        }
        m2928();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static ByteOrder m2912(C1246 c1246) throws IOException {
        short s = c1246.readShort();
        boolean z = f4529;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2913() {
        String strM2914 = m2914("DateTimeOriginal");
        HashMap[] mapArr = this.f4561;
        if (strM2914 != null && m2914("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM2914.concat("\u0000").getBytes(f4555);
            map.put("DateTime", new C1247(2, bytes.length, bytes));
        }
        if (m2914("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C1247.m2904(0L, this.f4563));
        }
        if (m2914("ImageLength") == null) {
            mapArr[0].put("ImageLength", C1247.m2904(0L, this.f4563));
        }
        if (m2914("Orientation") == null) {
            mapArr[0].put("Orientation", C1247.m2904(0L, this.f4563));
        }
        if (m2914("LightSource") == null) {
            mapArr[1].put("LightSource", C1247.m2904(0L, this.f4563));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m2914(String str) {
        C1247 c1247M2915 = m2915(str);
        if (c1247M2915 != null) {
            int i = c1247M2915.f4519;
            if (!f4553.contains(str)) {
                return c1247M2915.m2909(this.f4563);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C1249[] c1249Arr = (C1249[]) c1247M2915.m2910(this.f4563);
                if (c1249Arr == null || c1249Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c1249Arr));
                    return null;
                }
                C1249 c1249 = c1249Arr[0];
                Integer numValueOf = Integer.valueOf((int) (c1249.f4527 / c1249.f4528));
                C1249 c12410 = c1249Arr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c12410.f4527 / c12410.f4528));
                C1249 c12411 = c1249Arr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c12411.f4527 / c12411.f4528)));
            }
            try {
                return Double.toString(c1247M2915.m2907(this.f4563));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1247 m2915(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f4529) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f4549.length; i++) {
            C1247 c1247 = (C1247) this.f4561[i].get(str);
            if (c1247 != null) {
                return c1247;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2916(C1250 c1250) throws IOException {
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
                AbstractC1254.m2939(mediaMetadataRetriever, new C1245(c1250));
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
                HashMap[] mapArr = this.f4561;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C1247.m2906(Integer.parseInt(strExtractMetadata), this.f4563));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C1247.m2906(Integer.parseInt(strExtractMetadata2), this.f4563));
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
                    mapArr[0].put("Orientation", C1247.m2906(i, this.f4563));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c1250.m2911(i3);
                    byte[] bArr = new byte[6];
                    if (c1250.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, f4556)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (c1250.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.f4565 = i5;
                    m2929(0, bArr2);
                }
                if (f4529) {
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2917(p000.C1246 r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1251.m2917(ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲇᲀᤞᛸ, int, int):void");
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m2918(BufferedInputStream bufferedInputStream) throws Throwable {
        C1246 c1246;
        int i;
        C1246 c1247;
        C1246 c1248;
        C1246 c1249;
        int i2;
        C1246 c12410;
        C1246 c12411;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        int i6;
        byte[] bArr2;
        int i7;
        byte[] bArr3;
        C1246 c12412;
        short s;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr5 = f4532;
            if (i8 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i8] != bArr5[i8]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i9 = 0; i9 < bytes.length; i9++) {
                    if (bArr4[i9] != bytes[i9]) {
                        int i10 = 1;
                        try {
                            c1247 = new C1246(bArr4);
                            try {
                                try {
                                    long j2 = c1247.readInt();
                                    byte[] bArr6 = new byte[4];
                                    c1247.read(bArr6);
                                    try {
                                        try {
                                            if (Arrays.equals(bArr6, f4533)) {
                                                if (j2 == 1) {
                                                    j2 = c1247.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                    c1249 = new C1246(bArr4);
                                                    ByteOrder byteOrderM2912 = m2912(c1249);
                                                    this.f4563 = byteOrderM2912;
                                                    c1249.f4516 = byteOrderM2912;
                                                    s = c1249.readShort();
                                                    if (s != 20306 || s == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    c1249.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    try {
                                                        c12412 = new C1246(bArr4);
                                                        try {
                                                            ByteOrder byteOrderM2913 = m2912(c12412);
                                                            this.f4563 = byteOrderM2913;
                                                            c12412.f4516 = byteOrderM2913;
                                                            if (c12412.readShort() == 85) {
                                                                i3 = 1;
                                                            } else {
                                                                i3 = i;
                                                            }
                                                            c12412.close();
                                                        } catch (Exception unused) {
                                                            c12411 = c12412;
                                                            if (c12411 != null) {
                                                                c12411.close();
                                                            }
                                                            i3 = i;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            c12410 = c12412;
                                                            if (c12410 != null) {
                                                                c12410.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused2) {
                                                        c12411 = null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c12410 = null;
                                                    }
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = f4538;
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
                                                        bArr2 = f4542;
                                                        if (i6 < bArr2.length) {
                                                            i7 = i;
                                                            while (true) {
                                                                bArr3 = f4543;
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
                                                        for (long j5 = 0; j5 < j4 / 4 && c1247.read(bArr7) == 4; j5++) {
                                                            if (j5 != 1) {
                                                                if (Arrays.equals(bArr7, f4534)) {
                                                                    z = true;
                                                                } else if (Arrays.equals(bArr7, f4535)) {
                                                                    z2 = true;
                                                                }
                                                                if (z && z2) {
                                                                    c1247.close();
                                                                    return 12;
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        if (f4529) {
                                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                        }
                                                        if (c1247 != null) {
                                                        }
                                                        c1249 = new C1246(bArr4);
                                                        ByteOrder byteOrderM2914 = m2912(c1249);
                                                        this.f4563 = byteOrderM2914;
                                                        c1249.f4516 = byteOrderM2914;
                                                        s = c1249.readShort();
                                                        if (s != 20306) {
                                                            i2 = 1;
                                                        } else {
                                                            i2 = 1;
                                                        }
                                                        c1249.close();
                                                        if (i2 != 0) {
                                                            return 7;
                                                        }
                                                        c12412 = new C1246(bArr4);
                                                        ByteOrder byteOrderM2915 = m2912(c12412);
                                                        this.f4563 = byteOrderM2915;
                                                        c12412.f4516 = byteOrderM2915;
                                                        if (c12412.readShort() == 85) {
                                                            i3 = 1;
                                                        } else {
                                                            i3 = i;
                                                        }
                                                        c12412.close();
                                                        if (i3 != 0) {
                                                            return 10;
                                                        }
                                                        i4 = i;
                                                        while (true) {
                                                            bArr = f4538;
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
                                                            bArr2 = f4542;
                                                            if (i6 < bArr2.length) {
                                                                i7 = i;
                                                                while (true) {
                                                                    bArr3 = f4543;
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
                                                c1247.close();
                                                c1249 = new C1246(bArr4);
                                                ByteOrder byteOrderM2916 = m2912(c1249);
                                                this.f4563 = byteOrderM2916;
                                                c1249.f4516 = byteOrderM2916;
                                                s = c1249.readShort();
                                                if (s != 20306) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                c1249.close();
                                                if (i2 != 0) {
                                                    return 7;
                                                }
                                                c12412 = new C1246(bArr4);
                                                ByteOrder byteOrderM2917 = m2912(c12412);
                                                this.f4563 = byteOrderM2917;
                                                c12412.f4516 = byteOrderM2917;
                                                if (c12412.readShort() == 85) {
                                                    i3 = 1;
                                                } else {
                                                    i3 = i;
                                                }
                                                c12412.close();
                                                if (i3 != 0) {
                                                    return 10;
                                                }
                                                i4 = i;
                                                while (true) {
                                                    bArr = f4538;
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
                                                    bArr2 = f4542;
                                                    if (i6 < bArr2.length) {
                                                        i7 = i;
                                                        while (true) {
                                                            bArr3 = f4543;
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
                                            ByteOrder byteOrderM2918 = m2912(c1249);
                                            this.f4563 = byteOrderM2918;
                                            c1249.f4516 = byteOrderM2918;
                                            s = c1249.readShort();
                                            if (s != 20306) {
                                                i2 = 1;
                                            } else {
                                                i2 = 1;
                                            }
                                            c1249.close();
                                        } catch (Exception unused3) {
                                            if (c1249 != null) {
                                                c1249.close();
                                            }
                                            i2 = i;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            c1248 = c1249;
                                            if (c1248 != null) {
                                                c1248.close();
                                            }
                                            throw th;
                                        }
                                        c1249 = new C1246(bArr4);
                                    } catch (Exception unused4) {
                                        c1249 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c1248 = null;
                                    }
                                    c1247.close();
                                    i = 0;
                                } catch (Exception e2) {
                                    e = e2;
                                    i = 0;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c1246 = c1247;
                                if (c1246 != null) {
                                    c1246.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = 0;
                            c1247 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            c1246 = null;
                        }
                        if (i2 != 0) {
                            return 7;
                        }
                        c12412 = new C1246(bArr4);
                        ByteOrder byteOrderM2919 = m2912(c12412);
                        this.f4563 = byteOrderM2919;
                        c12412.f4516 = byteOrderM2919;
                        if (c12412.readShort() == 85) {
                            i3 = 1;
                        } else {
                            i3 = i;
                        }
                        c12412.close();
                        if (i3 != 0) {
                            return 10;
                        }
                        i4 = i;
                        while (true) {
                            bArr = f4538;
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
                            bArr2 = f4542;
                            if (i6 < bArr2.length) {
                                i7 = i;
                                while (true) {
                                    bArr3 = f4543;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2919(C1250 c1250) throws IOException {
        int i;
        int i2;
        m2922(c1250);
        HashMap[] mapArr = this.f4561;
        C1247 c1247 = (C1247) mapArr[1].get("MakerNote");
        if (c1247 != null) {
            C1250 c1251 = new C1250(c1247.f4522);
            c1251.f4516 = this.f4563;
            byte[] bArr = f4536;
            byte[] bArr2 = new byte[bArr.length];
            c1251.readFully(bArr2);
            c1251.m2911(0L);
            byte[] bArr3 = f4537;
            byte[] bArr4 = new byte[bArr3.length];
            c1251.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c1251.m2911(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c1251.m2911(12L);
            }
            m2930(c1251, 6);
            C1247 c1248 = (C1247) mapArr[7].get("PreviewImageStart");
            C1247 c1249 = (C1247) mapArr[7].get("PreviewImageLength");
            if (c1248 != null && c1249 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c1248);
                mapArr[5].put("JPEGInterchangeFormatLength", c1249);
            }
            C1247 c12410 = (C1247) mapArr[8].get("AspectFrame");
            if (c12410 != null) {
                int[] iArr = (int[]) c12410.m2910(this.f4563);
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
                C1247 c1247M2906 = C1247.m2906(i5, this.f4563);
                C1247 c1247M2907 = C1247.m2906(i6, this.f4563);
                mapArr[0].put("ImageWidth", c1247M2906);
                mapArr[0].put("ImageLength", c1247M2907);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m2920(C1246 c1246) throws IOException {
        if (f4529) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c1246);
        }
        c1246.f4516 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f4538;
        c1246.m2903(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c1246.readInt();
                byte[] bArr2 = new byte[4];
                if (c1246.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f4540)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f4541)) {
                    return;
                }
                if (Arrays.equals(bArr2, f4539)) {
                    byte[] bArr3 = new byte[i];
                    if (c1246.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC2203.m4026(bArr2));
                    }
                    int i3 = c1246.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f4565 = i2;
                        m2929(0, bArr3);
                        m2935();
                        m2932(new C1246(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c1246.m2903(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m2921(C1246 c1246) throws IOException {
        boolean z = f4529;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c1246);
        }
        c1246.m2903(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c1246.read(bArr);
        c1246.read(bArr2);
        c1246.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c1246.m2903(i - c1246.f4517);
        c1246.read(bArr4);
        m2917(new C1246(bArr4), i, 5);
        c1246.m2903(i3 - c1246.f4517);
        c1246.f4516 = ByteOrder.BIG_ENDIAN;
        int i4 = c1246.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c1246.readUnsignedShort();
            int unsignedShort2 = c1246.readUnsignedShort();
            if (unsignedShort == f4548.f4523) {
                short s = c1246.readShort();
                short s2 = c1246.readShort();
                C1247 c1247M2906 = C1247.m2906(s, this.f4563);
                C1247 c1247M2907 = C1247.m2906(s2, this.f4563);
                HashMap[] mapArr = this.f4561;
                mapArr[0].put("ImageLength", c1247M2906);
                mapArr[0].put("ImageWidth", c1247M2907);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            c1246.m2903(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2922(C1250 c1250) throws IOException {
        m2927(c1250);
        m2930(c1250, 0);
        m2934(c1250, 0);
        m2934(c1250, 5);
        m2934(c1250, 4);
        m2935();
        if (this.f4560 == 8) {
            HashMap[] mapArr = this.f4561;
            C1247 c1247 = (C1247) mapArr[1].get("MakerNote");
            if (c1247 != null) {
                C1250 c1251 = new C1250(c1247.f4522);
                c1251.f4516 = this.f4563;
                c1251.m2903(6);
                m2930(c1251, 9);
                C1247 c1248 = (C1247) mapArr[9].get("ColorSpace");
                if (c1248 != null) {
                    mapArr[1].put("ColorSpace", c1248);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2923(C1250 c1250) throws IOException {
        if (f4529) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c1250);
        }
        m2922(c1250);
        HashMap[] mapArr = this.f4561;
        C1247 c1247 = (C1247) mapArr[0].get("JpgFromRaw");
        if (c1247 != null) {
            m2917(new C1246(c1247.f4522), (int) c1247.f4521, 5);
        }
        C1247 c1248 = (C1247) mapArr[0].get("ISO");
        C1247 c1249 = (C1247) mapArr[1].get("PhotographicSensitivity");
        if (c1248 == null || c1249 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c1248);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2924(C1246 c1246) throws IOException {
        if (f4529) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c1246);
        }
        c1246.f4516 = ByteOrder.LITTLE_ENDIAN;
        c1246.m2903(f4542.length);
        int i = c1246.readInt() + 8;
        byte[] bArr = f4543;
        c1246.m2903(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c1246.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c1246.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f4544, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c1246.read(bArr3) == i2) {
                        this.f4565 = i3;
                        m2929(0, bArr3);
                        m2932(new C1246(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC2203.m4026(bArr2));
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
                c1246.m2903(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m2925(C1246 c1246, HashMap map) throws IOException {
        C1247 c1247 = (C1247) map.get("JPEGInterchangeFormat");
        C1247 c1248 = (C1247) map.get("JPEGInterchangeFormatLength");
        if (c1247 == null || c1248 == null) {
            return;
        }
        int iM2908 = c1247.m2908(this.f4563);
        int iM2909 = c1248.m2908(this.f4563);
        if (this.f4560 == 7) {
            iM2908 += this.f4566;
        }
        if (iM2908 > 0 && iM2909 > 0 && this.f4559 == null && this.f4558 == null) {
            c1246.skip(iM2908);
            c1246.read(new byte[iM2909]);
        }
        if (f4529) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM2908 + ", length: " + iM2909);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final boolean m2926(HashMap map) {
        C1247 c1247 = (C1247) map.get("ImageLength");
        C1247 c1248 = (C1247) map.get("ImageWidth");
        if (c1247 == null || c1248 == null) {
            return false;
        }
        return c1247.m2908(this.f4563) <= 512 && c1248.m2908(this.f4563) <= 512;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m2927(C1250 c1250) throws IOException {
        ByteOrder byteOrderM2912 = m2912(c1250);
        this.f4563 = byteOrderM2912;
        c1250.f4516 = byteOrderM2912;
        int unsignedShort = c1250.readUnsignedShort();
        int i = this.f4560;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c1250.readInt();
        if (i2 < 8) {
            throw new IOException(AbstractC1194.m2779(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c1250.m2903(i3);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m2928() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f4561;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM2787 = AbstractC1194.m2787(i, "The size of tag group[", "]: ");
            sbM2787.append(mapArr[i].size());
            Log.d("ExifInterface", sbM2787.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C1247 c1247 = (C1247) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c1247.toString() + ", tagValue: '" + c1247.m2909(this.f4563) + "'");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m2929(int i, byte[] bArr) throws IOException {
        C1250 c1250 = new C1250(bArr);
        m2927(c1250);
        m2930(c1250, i);
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m2930(C1250 c1250, int i) throws IOException {
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
        Integer numValueOf = Integer.valueOf(c1250.f4517);
        HashSet hashSet = this.f4562;
        hashSet.add(numValueOf);
        short s = c1250.readShort();
        boolean z2 = f4529;
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s));
        }
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            mapArr = this.f4561;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = c1250.readUnsignedShort();
            int unsignedShort3 = c1250.readUnsignedShort();
            int i5 = c1250.readInt();
            long j6 = ((long) c1250.f4517) + 4;
            C1248 c1248 = (C1248) f4551[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c1248 != null ? c1248.f4524 : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            }
            if (c1248 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f4546;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = c1248.f4525;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = c1248.f4526) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
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
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f4545[unsignedShort3] + ") is unexpected for tag: " + c1248.f4524);
                        }
                    }
                    if (z) {
                        j3 = j;
                        if (j2 > 4) {
                            i4 = c1250.readInt();
                            if (z2 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i4);
                            }
                            if (this.f4560 == 7) {
                                if ("MakerNote".equals(c1248.f4524)) {
                                    this.f4566 = i4;
                                } else if (i != 6 && "ThumbnailImage".equals(c1248.f4524)) {
                                    this.f4567 = i4;
                                    this.f4568 = i5;
                                    C1247 c1247M2906 = C1247.m2906(6, this.f4563);
                                    C1247 c1247M2904 = C1247.m2904(this.f4567, this.f4563);
                                    C1247 c1247M2905 = C1247.m2904(this.f4568, this.f4563);
                                    mapArr[4].put("Compression", c1247M2906);
                                    mapArr[4].put("JPEGInterchangeFormat", c1247M2904);
                                    mapArr[4].put("JPEGInterchangeFormatLength", c1247M2905);
                                }
                            }
                            c1250.m2911(i4);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            unsignedShort3 = unsignedShort3;
                        }
                        num = (Integer) f4554.get(Integer.valueOf(unsignedShort2));
                        if (z2 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            i3 = unsignedShort3;
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    j5 = ((long) c1250.readInt()) & 4294967295L;
                                } else if (i3 == 8) {
                                    unsignedShort = c1250.readShort();
                                } else if (i3 != 9 || i3 == 13) {
                                    unsignedShort = c1250.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z2 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1248.f4524));
                                }
                                if (j5 > 0) {
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        c1250.m2911(j5);
                                        m2930(c1250, num.intValue());
                                    } else if (z2 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                                }
                                c1250.m2911(j3);
                            } else {
                                unsignedShort = c1250.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1248.f4524));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    c1250.m2911(j5);
                                    m2930(c1250, num.intValue());
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            c1250.m2911(j3);
                        } else {
                            j4 = j3;
                            int i7 = c1250.f4517 + this.f4565;
                            byte[] bArr = new byte[(int) j2];
                            c1250.readFully(bArr);
                            C1247 c1247 = new C1247(i7, bArr, unsignedShort3, i5);
                            HashMap map = mapArr[i];
                            str = c1248.f4524;
                            map.put(str, c1247);
                            if ("DNGVersion".equals(str)) {
                                this.f4560 = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && c1247.m2909(this.f4563).contains("PENTAX")) || ("Compression".equals(str) && c1247.m2908(this.f4563) == 65535)) {
                                this.f4560 = 8;
                            }
                            if (c1250.f4517 != j4) {
                                c1250.m2911(j4);
                            }
                        }
                    } else {
                        c1250.m2911(j);
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
                    c1250.m2911(j);
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i4 = c1250.readInt();
                        if (z2 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i4);
                        }
                        if (this.f4560 == 7) {
                            if ("MakerNote".equals(c1248.f4524)) {
                                this.f4566 = i4;
                            } else if (i != 6) {
                            }
                        }
                        c1250.m2911(i4);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        unsignedShort3 = unsignedShort3;
                    }
                    num = (Integer) f4554.get(Integer.valueOf(unsignedShort2));
                    if (z2 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        i3 = unsignedShort3;
                        if (i3 != 3) {
                            if (i3 == 4) {
                                j5 = ((long) c1250.readInt()) & 4294967295L;
                            } else if (i3 == 8) {
                                if (i3 != 9) {
                                }
                                unsignedShort = c1250.readInt();
                            } else {
                                unsignedShort = c1250.readShort();
                            }
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1248.f4524));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    c1250.m2911(j5);
                                    m2930(c1250, num.intValue());
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            c1250.m2911(j3);
                        } else {
                            unsignedShort = c1250.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1248.f4524));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                c1250.m2911(j5);
                                m2930(c1250, num.intValue());
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        c1250.m2911(j3);
                    } else {
                        j4 = j3;
                        int i8 = c1250.f4517 + this.f4565;
                        byte[] bArr2 = new byte[(int) j2];
                        c1250.readFully(bArr2);
                        C1247 c1249 = new C1247(i8, bArr2, unsignedShort3, i5);
                        HashMap map2 = mapArr[i];
                        str = c1248.f4524;
                        map2.put(str, c1249);
                        if ("DNGVersion".equals(str)) {
                            this.f4560 = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f4560 = 8;
                        if (c1250.f4517 != j4) {
                            c1250.m2911(j4);
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
                c1250.m2911(j);
            } else {
                j3 = j;
                if (j2 > 4) {
                    i4 = c1250.readInt();
                    if (z2 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i4);
                    }
                    if (this.f4560 == 7) {
                        if ("MakerNote".equals(c1248.f4524)) {
                            this.f4566 = i4;
                        } else if (i != 6) {
                        }
                    }
                    c1250.m2911(i4);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    unsignedShort3 = unsignedShort3;
                }
                num = (Integer) f4554.get(Integer.valueOf(unsignedShort2));
                if (z2 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    i3 = unsignedShort3;
                    if (i3 != 3) {
                        if (i3 == 4) {
                            j5 = ((long) c1250.readInt()) & 4294967295L;
                        } else if (i3 == 8) {
                            if (i3 != 9) {
                            }
                            unsignedShort = c1250.readInt();
                        } else {
                            unsignedShort = c1250.readShort();
                        }
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1248.f4524));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                c1250.m2911(j5);
                                m2930(c1250, num.intValue());
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        c1250.m2911(j3);
                    } else {
                        unsignedShort = c1250.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z2 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1248.f4524));
                    }
                    if (j5 > 0) {
                        if (!hashSet.contains(Integer.valueOf((int) j5))) {
                            c1250.m2911(j5);
                            m2930(c1250, num.intValue());
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                        }
                    } else if (z2 != 0) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                    }
                    c1250.m2911(j3);
                } else {
                    j4 = j3;
                    int i9 = c1250.f4517 + this.f4565;
                    byte[] bArr3 = new byte[(int) j2];
                    c1250.readFully(bArr3);
                    C1247 c12410 = new C1247(i9, bArr3, unsignedShort3, i5);
                    HashMap map3 = mapArr[i];
                    str = c1248.f4524;
                    map3.put(str, c12410);
                    if ("DNGVersion".equals(str)) {
                        this.f4560 = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f4560 = 8;
                    if (c1250.f4517 != j4) {
                        c1250.m2911(j4);
                    }
                }
            }
            s2 = (short) (s2 + 1);
            s = s;
            z2 = z2;
        }
        boolean z3 = z2;
        int i10 = c1250.readInt();
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
        c1250.m2911(j7);
        if (mapArr[4].isEmpty()) {
            m2930(c1250, 4);
        } else if (mapArr[5].isEmpty()) {
            m2930(c1250, 5);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void m2931(int i, String str, String str2) {
        HashMap[] mapArr = this.f4561;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m2932(C1246 c1246) throws IOException {
        C1247 c1247;
        int iM2908;
        HashMap map = this.f4561[4];
        C1247 c1248 = (C1247) map.get("Compression");
        if (c1248 == null) {
            m2925(c1246, map);
            return;
        }
        int iM2909 = c1248.m2908(this.f4563);
        if (iM2909 != 1) {
            if (iM2909 == 6) {
                m2925(c1246, map);
                return;
            } else if (iM2909 != 7) {
                return;
            }
        }
        C1247 c1249 = (C1247) map.get("BitsPerSample");
        if (c1249 != null) {
            int[] iArr = (int[]) c1249.m2910(this.f4563);
            int[] iArr2 = f4530;
            if (Arrays.equals(iArr2, iArr) || (this.f4560 == 3 && (c1247 = (C1247) map.get("PhotometricInterpretation")) != null && (((iM2908 = c1247.m2908(this.f4563)) == 1 && Arrays.equals(iArr, f4531)) || (iM2908 == 6 && Arrays.equals(iArr, iArr2))))) {
                C1247 c12410 = (C1247) map.get("StripOffsets");
                C1247 c12411 = (C1247) map.get("StripByteCounts");
                if (c12410 == null || c12411 == null) {
                    return;
                }
                long[] jArrM4029 = AbstractC2203.m4029(c12410.m2910(this.f4563));
                long[] jArrM40210 = AbstractC2203.m4029(c12411.m2910(this.f4563));
                if (jArrM4029 == null || jArrM4029.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM40210 == null || jArrM40210.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM4029.length != jArrM40210.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM40210) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f4564 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM4029.length; i3++) {
                    int i4 = (int) jArrM4029[i3];
                    int i5 = (int) jArrM40210[i3];
                    if (i3 < jArrM4029.length - 1 && i4 + i5 != jArrM4029[i3 + 1]) {
                        this.f4564 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (c1246.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (c1246.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.f4564) {
                    long j4 = jArrM4029[0];
                    return;
                }
                return;
            }
        }
        if (f4529) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void m2933(int i, int i2) {
        HashMap[] mapArr = this.f4561;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f4529;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C1247 c1247 = (C1247) mapArr[i].get("ImageLength");
        C1247 c1248 = (C1247) mapArr[i].get("ImageWidth");
        C1247 c1249 = (C1247) mapArr[i2].get("ImageLength");
        C1247 c12410 = (C1247) mapArr[i2].get("ImageWidth");
        if (c1247 == null || c1248 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c1249 == null || c12410 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM2908 = c1247.m2908(this.f4563);
        int iM2909 = c1248.m2908(this.f4563);
        int iM29010 = c1249.m2908(this.f4563);
        int iM29011 = c12410.m2908(this.f4563);
        if (iM2908 >= iM29010 || iM2909 >= iM29011) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void m2934(C1250 c1250, int i) throws IOException {
        C1247 c1247M2906;
        C1247 c1247M2907;
        HashMap[] mapArr = this.f4561;
        C1247 c1247 = (C1247) mapArr[i].get("DefaultCropSize");
        C1247 c1248 = (C1247) mapArr[i].get("SensorTopBorder");
        C1247 c1249 = (C1247) mapArr[i].get("SensorLeftBorder");
        C1247 c12410 = (C1247) mapArr[i].get("SensorBottomBorder");
        C1247 c12411 = (C1247) mapArr[i].get("SensorRightBorder");
        if (c1247 != null) {
            if (c1247.f4519 == 5) {
                C1249[] c1249Arr = (C1249[]) c1247.m2910(this.f4563);
                if (c1249Arr == null || c1249Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c1249Arr));
                    return;
                }
                c1247M2906 = C1247.m2905(c1249Arr[0], this.f4563);
                c1247M2907 = C1247.m2905(c1249Arr[1], this.f4563);
            } else {
                int[] iArr = (int[]) c1247.m2910(this.f4563);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c1247M2906 = C1247.m2906(iArr[0], this.f4563);
                c1247M2907 = C1247.m2906(iArr[1], this.f4563);
            }
            mapArr[i].put("ImageWidth", c1247M2906);
            mapArr[i].put("ImageLength", c1247M2907);
            return;
        }
        if (c1248 != null && c1249 != null && c12410 != null && c12411 != null) {
            int iM2908 = c1248.m2908(this.f4563);
            int iM2909 = c12410.m2908(this.f4563);
            int iM29010 = c12411.m2908(this.f4563);
            int iM29011 = c1249.m2908(this.f4563);
            if (iM2909 <= iM2908 || iM29010 <= iM29011) {
                return;
            }
            C1247 c1247M2908 = C1247.m2906(iM2909 - iM2908, this.f4563);
            C1247 c1247M2909 = C1247.m2906(iM29010 - iM29011, this.f4563);
            mapArr[i].put("ImageLength", c1247M2908);
            mapArr[i].put("ImageWidth", c1247M2909);
            return;
        }
        C1247 c12412 = (C1247) mapArr[i].get("ImageLength");
        C1247 c12413 = (C1247) mapArr[i].get("ImageWidth");
        if (c12412 == null || c12413 == null) {
            C1247 c12414 = (C1247) mapArr[i].get("JPEGInterchangeFormat");
            C1247 c12415 = (C1247) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c12414 == null || c12415 == null) {
                return;
            }
            int iM29012 = c12414.m2908(this.f4563);
            int iM29013 = c12414.m2908(this.f4563);
            c1250.m2911(iM29012);
            byte[] bArr = new byte[iM29013];
            c1250.read(bArr);
            m2917(new C1246(bArr), iM29012, i);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m2935() {
        m2933(0, 5);
        m2933(0, 4);
        m2933(5, 4);
        HashMap[] mapArr = this.f4561;
        C1247 c1247 = (C1247) mapArr[1].get("PixelXDimension");
        C1247 c1248 = (C1247) mapArr[1].get("PixelYDimension");
        if (c1247 != null && c1248 != null) {
            mapArr[0].put("ImageWidth", c1247);
            mapArr[0].put("ImageLength", c1248);
        }
        if (mapArr[4].isEmpty() && m2926(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m2926(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m2931(0, "ThumbnailOrientation", "Orientation");
        m2931(0, "ThumbnailImageLength", "ImageLength");
        m2931(0, "ThumbnailImageWidth", "ImageWidth");
        m2931(5, "ThumbnailOrientation", "Orientation");
        m2931(5, "ThumbnailImageLength", "ImageLength");
        m2931(5, "ThumbnailImageWidth", "ImageWidth");
        m2931(4, "Orientation", "ThumbnailOrientation");
        m2931(4, "ImageLength", "ThumbnailImageLength");
        m2931(4, "ImageWidth", "ThumbnailImageWidth");
    }
}

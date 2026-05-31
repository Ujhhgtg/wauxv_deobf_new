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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲇᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1253 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final boolean f4528 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final int[] f4529;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final int[] f4530;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final byte[] f4531;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final byte[] f4532;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final byte[] f4533;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final byte[] f4534;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final byte[] f4535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final byte[] f4536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final byte[] f4537;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final byte[] f4538;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static final byte[] f4539;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static final byte[] f4540;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final byte[] f4541;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f4542;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final byte[] f4543;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final String[] f4544;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static final int[] f4545;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static final byte[] f4546;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final C1250 f4547;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static final C1250[][] f4548;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static final C1250[] f4549;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static final HashMap[] f4550;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static final HashMap[] f4551;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static final HashSet f4552;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static final HashMap f4553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static final Charset f4554;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static final byte[] f4555;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static final byte[] f4556;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final FileDescriptor f4557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AssetManager.AssetInputStream f4558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f4559;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final HashMap[] f4560;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final HashSet f4561;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public ByteOrder f4562;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f4563;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f4564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f4565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f4566;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f4567;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f4529 = new int[]{8, 8, 8};
        f4530 = new int[]{8};
        f4531 = new byte[]{-1, JSONB.Constants.BC_INT64_NUM_MIN, -1};
        f4532 = new byte[]{102, 116, JSONB.Constants.BC_STR_ASCII, 112};
        f4533 = new byte[]{JSONB.Constants.BC_STR_ASCII_FIX_36, JSONB.Constants.BC_STR_ASCII_FIX_32, 102, 49};
        f4534 = new byte[]{104, 101, JSONB.Constants.BC_STR_ASCII_FIX_32, 99};
        f4535 = new byte[]{79, 76, 89, JSONB.Constants.BC_STR_ASCII_FIX_4, 80, 0};
        f4536 = new byte[]{79, 76, 89, JSONB.Constants.BC_STR_ASCII_FIX_4, 80, 85, 83, 0, 73, 73};
        f4537 = new byte[]{-119, 80, JSONB.Constants.BC_STR_ASCII_FIX_5, JSONB.Constants.BC_INT32_SHORT_MAX, ek.k, 10, 26, 10};
        f4538 = new byte[]{101, 88, 73, 102};
        f4539 = new byte[]{73, JSONB.Constants.BC_INT32, JSONB.Constants.BC_INT32_SHORT_ZERO, 82};
        f4540 = new byte[]{73, 69, JSONB.Constants.BC_STR_ASCII_FIX_5, JSONB.Constants.BC_INT32_SHORT_ZERO};
        f4541 = new byte[]{82, 73, 70, 70};
        f4542 = new byte[]{87, 69, 66, 80};
        f4543 = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f4544 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f4545 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f4546 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C1250[] c1250Arr = {new C1250("NewSubfileType", 254, 4), new C1250("SubfileType", 255, 4), new C1250(bc.e, "ImageWidth", 3, 4), new C1250(257, "ImageLength", 3, 4), new C1250("BitsPerSample", 258, 3), new C1250("Compression", 259, 3), new C1250("PhotometricInterpretation", 262, 3), new C1250("ImageDescription", 270, 2), new C1250("Make", 271, 2), new C1250("Model", 272, 2), new C1250(b.a, "StripOffsets", 3, 4), new C1250("Orientation", 274, 3), new C1250("SamplesPerPixel", 277, 3), new C1250(278, "RowsPerStrip", 3, 4), new C1250(279, "StripByteCounts", 3, 4), new C1250("XResolution", 282, 5), new C1250("YResolution", 283, 5), new C1250("PlanarConfiguration", 284, 3), new C1250("ResolutionUnit", 296, 3), new C1250("TransferFunction", c.p, 3), new C1250("Software", 305, 2), new C1250("DateTime", 306, 2), new C1250("Artist", 315, 2), new C1250("WhitePoint", 318, 5), new C1250("PrimaryChromaticities", 319, 5), new C1250("SubIFDPointer", 330, 4), new C1250("JPEGInterchangeFormat", 513, 4), new C1250("JPEGInterchangeFormatLength", 514, 4), new C1250("YCbCrCoefficients", 529, 5), new C1250("YCbCrSubSampling", 530, 3), new C1250("YCbCrPositioning", 531, 3), new C1250("ReferenceBlackWhite", 532, 5), new C1250("Copyright", 33432, 2), new C1250("ExifIFDPointer", 34665, 4), new C1250("GPSInfoIFDPointer", 34853, 4), new C1250("SensorTopBorder", 4, 4), new C1250("SensorLeftBorder", 5, 4), new C1250("SensorBottomBorder", 6, 4), new C1250("SensorRightBorder", 7, 4), new C1250("ISO", 23, 3), new C1250("JpgFromRaw", 46, 7), new C1250("Xmp", 700, 1)};
        C1250[] c1250Arr2 = {new C1250("ExposureTime", 33434, 5), new C1250("FNumber", 33437, 5), new C1250("ExposureProgram", 34850, 3), new C1250("SpectralSensitivity", 34852, 2), new C1250("PhotographicSensitivity", 34855, 3), new C1250("OECF", 34856, 7), new C1250("SensitivityType", 34864, 3), new C1250("StandardOutputSensitivity", 34865, 4), new C1250("RecommendedExposureIndex", 34866, 4), new C1250("ISOSpeed", 34867, 4), new C1250("ISOSpeedLatitudeyyy", 34868, 4), new C1250("ISOSpeedLatitudezzz", 34869, 4), new C1250("ExifVersion", 36864, 2), new C1250("DateTimeOriginal", 36867, 2), new C1250("DateTimeDigitized", 36868, 2), new C1250("OffsetTime", 36880, 2), new C1250("OffsetTimeOriginal", 36881, 2), new C1250("OffsetTimeDigitized", 36882, 2), new C1250("ComponentsConfiguration", 37121, 7), new C1250("CompressedBitsPerPixel", 37122, 5), new C1250("ShutterSpeedValue", 37377, 10), new C1250("ApertureValue", 37378, 5), new C1250("BrightnessValue", 37379, 10), new C1250("ExposureBiasValue", 37380, 10), new C1250("MaxApertureValue", 37381, 5), new C1250("SubjectDistance", 37382, 5), new C1250("MeteringMode", 37383, 3), new C1250("LightSource", 37384, 3), new C1250("Flash", 37385, 3), new C1250("FocalLength", 37386, 5), new C1250("SubjectArea", 37396, 3), new C1250("MakerNote", 37500, 7), new C1250("UserComment", 37510, 7), new C1250("SubSecTime", 37520, 2), new C1250("SubSecTimeOriginal", 37521, 2), new C1250("SubSecTimeDigitized", 37522, 2), new C1250("FlashpixVersion", 40960, 7), new C1250("ColorSpace", 40961, 3), new C1250(40962, "PixelXDimension", 3, 4), new C1250(40963, "PixelYDimension", 3, 4), new C1250("RelatedSoundFile", 40964, 2), new C1250("InteroperabilityIFDPointer", 40965, 4), new C1250("FlashEnergy", 41483, 5), new C1250("SpatialFrequencyResponse", 41484, 7), new C1250("FocalPlaneXResolution", 41486, 5), new C1250("FocalPlaneYResolution", 41487, 5), new C1250("FocalPlaneResolutionUnit", 41488, 3), new C1250("SubjectLocation", 41492, 3), new C1250("ExposureIndex", 41493, 5), new C1250("SensingMethod", 41495, 3), new C1250("FileSource", 41728, 7), new C1250("SceneType", 41729, 7), new C1250("CFAPattern", 41730, 7), new C1250("CustomRendered", 41985, 3), new C1250("ExposureMode", 41986, 3), new C1250("WhiteBalance", 41987, 3), new C1250("DigitalZoomRatio", 41988, 5), new C1250("FocalLengthIn35mmFilm", 41989, 3), new C1250("SceneCaptureType", 41990, 3), new C1250("GainControl", 41991, 3), new C1250("Contrast", 41992, 3), new C1250("Saturation", 41993, 3), new C1250("Sharpness", 41994, 3), new C1250("DeviceSettingDescription", 41995, 7), new C1250("SubjectDistanceRange", 41996, 3), new C1250("ImageUniqueID", 42016, 2), new C1250("CameraOwnerName", 42032, 2), new C1250("BodySerialNumber", 42033, 2), new C1250("LensSpecification", 42034, 5), new C1250("LensMake", 42035, 2), new C1250("LensModel", 42036, 2), new C1250("Gamma", 42240, 5), new C1250("DNGVersion", 50706, 1), new C1250(50720, "DefaultCropSize", 3, 4)};
        C1250[] c1250Arr3 = {new C1250("GPSVersionID", 0, 1), new C1250("GPSLatitudeRef", 1, 2), new C1250(2, "GPSLatitude", 5, 10), new C1250("GPSLongitudeRef", 3, 2), new C1250(4, "GPSLongitude", 5, 10), new C1250("GPSAltitudeRef", 5, 1), new C1250("GPSAltitude", 6, 5), new C1250("GPSTimeStamp", 7, 5), new C1250("GPSSatellites", 8, 2), new C1250("GPSStatus", 9, 2), new C1250("GPSMeasureMode", 10, 2), new C1250("GPSDOP", 11, 5), new C1250("GPSSpeedRef", 12, 2), new C1250("GPSSpeed", 13, 5), new C1250("GPSTrackRef", 14, 2), new C1250("GPSTrack", 15, 5), new C1250("GPSImgDirectionRef", 16, 2), new C1250("GPSImgDirection", 17, 5), new C1250("GPSMapDatum", 18, 2), new C1250("GPSDestLatitudeRef", 19, 2), new C1250("GPSDestLatitude", 20, 5), new C1250("GPSDestLongitudeRef", 21, 2), new C1250("GPSDestLongitude", 22, 5), new C1250("GPSDestBearingRef", 23, 2), new C1250("GPSDestBearing", 24, 5), new C1250("GPSDestDistanceRef", 25, 2), new C1250("GPSDestDistance", 26, 5), new C1250("GPSProcessingMethod", 27, 7), new C1250("GPSAreaInformation", 28, 7), new C1250("GPSDateStamp", 29, 2), new C1250("GPSDifferential", 30, 3), new C1250("GPSHPositioningError", 31, 5)};
        C1250[] c1250Arr4 = {new C1250("InteroperabilityIndex", 1, 2)};
        C1250[] c1250Arr5 = {new C1250("NewSubfileType", 254, 4), new C1250("SubfileType", 255, 4), new C1250(bc.e, "ThumbnailImageWidth", 3, 4), new C1250(257, "ThumbnailImageLength", 3, 4), new C1250("BitsPerSample", 258, 3), new C1250("Compression", 259, 3), new C1250("PhotometricInterpretation", 262, 3), new C1250("ImageDescription", 270, 2), new C1250("Make", 271, 2), new C1250("Model", 272, 2), new C1250(b.a, "StripOffsets", 3, 4), new C1250("ThumbnailOrientation", 274, 3), new C1250("SamplesPerPixel", 277, 3), new C1250(278, "RowsPerStrip", 3, 4), new C1250(279, "StripByteCounts", 3, 4), new C1250("XResolution", 282, 5), new C1250("YResolution", 283, 5), new C1250("PlanarConfiguration", 284, 3), new C1250("ResolutionUnit", 296, 3), new C1250("TransferFunction", c.p, 3), new C1250("Software", 305, 2), new C1250("DateTime", 306, 2), new C1250("Artist", 315, 2), new C1250("WhitePoint", 318, 5), new C1250("PrimaryChromaticities", 319, 5), new C1250("SubIFDPointer", 330, 4), new C1250("JPEGInterchangeFormat", 513, 4), new C1250("JPEGInterchangeFormatLength", 514, 4), new C1250("YCbCrCoefficients", 529, 5), new C1250("YCbCrSubSampling", 530, 3), new C1250("YCbCrPositioning", 531, 3), new C1250("ReferenceBlackWhite", 532, 5), new C1250("Copyright", 33432, 2), new C1250("ExifIFDPointer", 34665, 4), new C1250("GPSInfoIFDPointer", 34853, 4), new C1250("DNGVersion", 50706, 1), new C1250(50720, "DefaultCropSize", 3, 4)};
        f4547 = new C1250("StripOffsets", b.a, 3);
        f4548 = new C1250[][]{c1250Arr, c1250Arr2, c1250Arr3, c1250Arr4, c1250Arr5, c1250Arr, new C1250[]{new C1250("ThumbnailImage", bc.e, 7), new C1250("CameraSettingsIFDPointer", 8224, 4), new C1250("ImageProcessingIFDPointer", 8256, 4)}, new C1250[]{new C1250("PreviewImageStart", 257, 4), new C1250("PreviewImageLength", 258, 4)}, new C1250[]{new C1250("AspectFrame", 4371, 3)}, new C1250[]{new C1250("ColorSpace", 55, 3)}};
        f4549 = new C1250[]{new C1250("SubIFDPointer", 330, 4), new C1250("ExifIFDPointer", 34665, 4), new C1250("GPSInfoIFDPointer", 34853, 4), new C1250("InteroperabilityIFDPointer", 40965, 4), new C1250("CameraSettingsIFDPointer", 8224, 1), new C1250("ImageProcessingIFDPointer", 8256, 1)};
        f4550 = new HashMap[10];
        f4551 = new HashMap[10];
        f4552 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f4553 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f4554 = charsetForName;
        f4555 = "Exif\u0000\u0000".getBytes(charsetForName);
        f4556 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C1250[][] c1250Arr6 = f4548;
            if (i >= c1250Arr6.length) {
                HashMap map = f4553;
                C1250[] c1250Arr7 = f4549;
                map.put(Integer.valueOf(c1250Arr7[0].f4522), 5);
                map.put(Integer.valueOf(c1250Arr7[1].f4522), 1);
                map.put(Integer.valueOf(c1250Arr7[2].f4522), 2);
                map.put(Integer.valueOf(c1250Arr7[3].f4522), 3);
                map.put(Integer.valueOf(c1250Arr7[4].f4522), 7);
                map.put(Integer.valueOf(c1250Arr7[5].f4522), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f4550[i] = new HashMap();
            f4551[i] = new HashMap();
            for (C1250 c1250 : c1250Arr6[i]) {
                f4550[i].put(Integer.valueOf(c1250.f4522), c1250);
                f4551[i].put(c1250.f4523, c1250);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public C1253(InputStream inputStream) throws IOException {
        C1250[][] c1250Arr = f4548;
        this.f4560 = new HashMap[c1250Arr.length];
        this.f4561 = new HashSet(c1250Arr.length);
        this.f4562 = ByteOrder.BIG_ENDIAN;
        boolean z = inputStream instanceof AssetManager.AssetInputStream;
        boolean z2 = f4528;
        if (z) {
            this.f4558 = (AssetManager.AssetInputStream) inputStream;
            this.f4557 = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC1255.m3057(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f4558 = null;
                this.f4557 = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z2) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f4558 = null;
                this.f4557 = null;
            }
        } else {
            this.f4558 = null;
            this.f4557 = null;
        }
        for (int i = 0; i < c1250Arr.length; i++) {
            try {
                try {
                    this.f4560[i] = new HashMap();
                } catch (Throwable th) {
                    m3032();
                    if (z2) {
                        m3047();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m3032();
                if (!z2) {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m3032();
                if (!z2) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM3037 = m3037(bufferedInputStream);
        this.f4559 = iM3037;
        if (iM3037 == 4 || iM3037 == 9 || iM3037 == 13 || iM3037 == 14) {
            C1248 c1248 = new C1248(bufferedInputStream);
            int i2 = this.f4559;
            if (i2 == 4) {
                m3036(c1248, 0, 0);
            } else if (i2 == 13) {
                m3039(c1248);
            } else if (i2 == 9) {
                m3040(c1248);
            } else if (i2 == 14) {
                m3043(c1248);
            }
        } else {
            C1252 c1252 = new C1252(bufferedInputStream);
            int i3 = this.f4559;
            if (i3 == 12) {
                m3035(c1252);
            } else if (i3 == 7) {
                m3038(c1252);
            } else if (i3 == 10) {
                m3042(c1252);
            } else {
                m3041(c1252);
            }
            c1252.m3030(this.f4564);
            m3051(c1252);
        }
        m3032();
        if (!z2) {
            return;
        }
        m3047();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static ByteOrder m3031(C1248 c1248) throws IOException {
        short s = c1248.readShort();
        boolean z = f4528;
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
    public final void m3032() {
        String strM3033 = m3033("DateTimeOriginal");
        HashMap[] mapArr = this.f4560;
        if (strM3033 != null && m3033("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM3033.concat("\u0000").getBytes(f4554);
            map.put("DateTime", new C1249(2, bytes.length, bytes));
        }
        if (m3033("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C1249.m3023(0L, this.f4562));
        }
        if (m3033("ImageLength") == null) {
            mapArr[0].put("ImageLength", C1249.m3023(0L, this.f4562));
        }
        if (m3033("Orientation") == null) {
            mapArr[0].put("Orientation", C1249.m3023(0L, this.f4562));
        }
        if (m3033("LightSource") == null) {
            mapArr[1].put("LightSource", C1249.m3023(0L, this.f4562));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m3033(String str) {
        C1249 c1249M3034 = m3034(str);
        if (c1249M3034 != null) {
            int i = c1249M3034.f4518;
            if (!f4552.contains(str)) {
                return c1249M3034.m3028(this.f4562);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C1251[] c1251Arr = (C1251[]) c1249M3034.m3029(this.f4562);
                if (c1251Arr == null || c1251Arr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c1251Arr));
                    return null;
                }
                C1251 c1251 = c1251Arr[0];
                Integer numValueOf = Integer.valueOf((int) (c1251.f4526 / c1251.f4527));
                C1251 c1252 = c1251Arr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c1252.f4526 / c1252.f4527));
                C1251 c1253 = c1251Arr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c1253.f4526 / c1253.f4527)));
            }
            try {
                return Double.toString(c1249M3034.m3026(this.f4562));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1249 m3034(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f4528) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f4548.length; i++) {
            C1249 c1249 = (C1249) this.f4560[i].get(str);
            if (c1249 != null) {
                return c1249;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3035(C1252 c1252) throws IOException {
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
                AbstractC1256.m3058(mediaMetadataRetriever, new C1247(c1252));
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
                HashMap[] mapArr = this.f4560;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C1249.m3025(Integer.parseInt(strExtractMetadata), this.f4562));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C1249.m3025(Integer.parseInt(strExtractMetadata2), this.f4562));
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
                    mapArr[0].put("Orientation", C1249.m3025(i, this.f4562));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c1252.m3030(i3);
                    byte[] bArr = new byte[6];
                    if (c1252.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, f4555)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (c1252.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.f4564 = i5;
                    m3048(0, bArr2);
                }
                if (f4528) {
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
    public final void m3036(p000.C1248 r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1253.m3036(ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲇᛸᤞᲀ, int, int):void");
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
    public final int m3037(BufferedInputStream bufferedInputStream) throws Throwable {
        C1248 c1248;
        int i;
        C1248 c1249;
        C1248 c12410;
        C1248 c12411;
        int i2;
        C1248 c12412;
        C1248 c12413;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        int i6;
        byte[] bArr2;
        int i7;
        byte[] bArr3;
        C1248 c12414;
        short s;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr5 = f4531;
            if (i8 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i8] != bArr5[i8]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i9 = 0; i9 < bytes.length; i9++) {
                    if (bArr4[i9] != bytes[i9]) {
                        int i10 = 1;
                        try {
                            c1249 = new C1248(bArr4);
                            try {
                                try {
                                    long j2 = c1249.readInt();
                                    byte[] bArr6 = new byte[4];
                                    c1249.read(bArr6);
                                    try {
                                        try {
                                            if (Arrays.equals(bArr6, f4532)) {
                                                if (j2 == 1) {
                                                    j2 = c1249.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                    c12411 = new C1248(bArr4);
                                                    ByteOrder byteOrderM3031 = m3031(c12411);
                                                    this.f4562 = byteOrderM3031;
                                                    c12411.f4515 = byteOrderM3031;
                                                    s = c12411.readShort();
                                                    if (s != 20306 || s == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    c12411.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    try {
                                                        c12414 = new C1248(bArr4);
                                                        try {
                                                            ByteOrder byteOrderM3032 = m3031(c12414);
                                                            this.f4562 = byteOrderM3032;
                                                            c12414.f4515 = byteOrderM3032;
                                                            if (c12414.readShort() == 85) {
                                                                i3 = 1;
                                                            } else {
                                                                i3 = i;
                                                            }
                                                            c12414.close();
                                                        } catch (Exception unused) {
                                                            c12413 = c12414;
                                                            if (c12413 != null) {
                                                                c12413.close();
                                                            }
                                                            i3 = i;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            c12412 = c12414;
                                                            if (c12412 != null) {
                                                                c12412.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused2) {
                                                        c12413 = null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c12412 = null;
                                                    }
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = f4537;
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
                                                        bArr2 = f4541;
                                                        if (i6 < bArr2.length) {
                                                            i7 = i;
                                                            while (true) {
                                                                bArr3 = f4542;
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
                                                        for (long j5 = 0; j5 < j4 / 4 && c1249.read(bArr7) == 4; j5++) {
                                                            if (j5 != 1) {
                                                                if (Arrays.equals(bArr7, f4533)) {
                                                                    z = true;
                                                                } else if (Arrays.equals(bArr7, f4534)) {
                                                                    z2 = true;
                                                                }
                                                                if (z && z2) {
                                                                    c1249.close();
                                                                    return 12;
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        e = e;
                                                        if (f4528) {
                                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                        }
                                                        if (c1249 != null) {
                                                        }
                                                        c12411 = new C1248(bArr4);
                                                        ByteOrder byteOrderM3033 = m3031(c12411);
                                                        this.f4562 = byteOrderM3033;
                                                        c12411.f4515 = byteOrderM3033;
                                                        s = c12411.readShort();
                                                        if (s != 20306) {
                                                            i2 = 1;
                                                        } else {
                                                            i2 = 1;
                                                        }
                                                        c12411.close();
                                                        if (i2 != 0) {
                                                            return 7;
                                                        }
                                                        c12414 = new C1248(bArr4);
                                                        ByteOrder byteOrderM3034 = m3031(c12414);
                                                        this.f4562 = byteOrderM3034;
                                                        c12414.f4515 = byteOrderM3034;
                                                        if (c12414.readShort() == 85) {
                                                            i3 = 1;
                                                        } else {
                                                            i3 = i;
                                                        }
                                                        c12414.close();
                                                        if (i3 != 0) {
                                                            return 10;
                                                        }
                                                        i4 = i;
                                                        while (true) {
                                                            bArr = f4537;
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
                                                            bArr2 = f4541;
                                                            if (i6 < bArr2.length) {
                                                                i7 = i;
                                                                while (true) {
                                                                    bArr3 = f4542;
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
                                                c1249.close();
                                                c12411 = new C1248(bArr4);
                                                ByteOrder byteOrderM3035 = m3031(c12411);
                                                this.f4562 = byteOrderM3035;
                                                c12411.f4515 = byteOrderM3035;
                                                s = c12411.readShort();
                                                if (s != 20306) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                c12411.close();
                                                if (i2 != 0) {
                                                    return 7;
                                                }
                                                c12414 = new C1248(bArr4);
                                                ByteOrder byteOrderM3036 = m3031(c12414);
                                                this.f4562 = byteOrderM3036;
                                                c12414.f4515 = byteOrderM3036;
                                                if (c12414.readShort() == 85) {
                                                    i3 = 1;
                                                } else {
                                                    i3 = i;
                                                }
                                                c12414.close();
                                                if (i3 != 0) {
                                                    return 10;
                                                }
                                                i4 = i;
                                                while (true) {
                                                    bArr = f4537;
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
                                                    bArr2 = f4541;
                                                    if (i6 < bArr2.length) {
                                                        i7 = i;
                                                        while (true) {
                                                            bArr3 = f4542;
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
                                            ByteOrder byteOrderM3037 = m3031(c12411);
                                            this.f4562 = byteOrderM3037;
                                            c12411.f4515 = byteOrderM3037;
                                            s = c12411.readShort();
                                            if (s != 20306) {
                                                i2 = 1;
                                            } else {
                                                i2 = 1;
                                            }
                                            c12411.close();
                                        } catch (Exception unused3) {
                                            if (c12411 != null) {
                                                c12411.close();
                                            }
                                            i2 = i;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            c12410 = c12411;
                                            if (c12410 != null) {
                                                c12410.close();
                                            }
                                            throw th;
                                        }
                                        c12411 = new C1248(bArr4);
                                    } catch (Exception unused4) {
                                        c12411 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        c12410 = null;
                                    }
                                    c1249.close();
                                    i = 0;
                                } catch (Exception e2) {
                                    e = e2;
                                    i = 0;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c1248 = c1249;
                                if (c1248 != null) {
                                    c1248.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = 0;
                            c1249 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            c1248 = null;
                        }
                        if (i2 != 0) {
                            return 7;
                        }
                        c12414 = new C1248(bArr4);
                        ByteOrder byteOrderM3038 = m3031(c12414);
                        this.f4562 = byteOrderM3038;
                        c12414.f4515 = byteOrderM3038;
                        if (c12414.readShort() == 85) {
                            i3 = 1;
                        } else {
                            i3 = i;
                        }
                        c12414.close();
                        if (i3 != 0) {
                            return 10;
                        }
                        i4 = i;
                        while (true) {
                            bArr = f4537;
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
                            bArr2 = f4541;
                            if (i6 < bArr2.length) {
                                i7 = i;
                                while (true) {
                                    bArr3 = f4542;
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
    public final void m3038(C1252 c1252) throws Throwable {
        int i;
        int i2;
        m3041(c1252);
        HashMap[] mapArr = this.f4560;
        C1249 c1249 = (C1249) mapArr[1].get("MakerNote");
        if (c1249 != null) {
            C1252 c1253 = new C1252(c1249.f4521);
            c1253.f4515 = this.f4562;
            byte[] bArr = f4535;
            byte[] bArr2 = new byte[bArr.length];
            c1253.readFully(bArr2);
            c1253.m3030(0L);
            byte[] bArr3 = f4536;
            byte[] bArr4 = new byte[bArr3.length];
            c1253.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c1253.m3030(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c1253.m3030(12L);
            }
            m3049(c1253, 6);
            C1249 c12410 = (C1249) mapArr[7].get("PreviewImageStart");
            C1249 c12411 = (C1249) mapArr[7].get("PreviewImageLength");
            if (c12410 != null && c12411 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c12410);
                mapArr[5].put("JPEGInterchangeFormatLength", c12411);
            }
            C1249 c12412 = (C1249) mapArr[8].get("AspectFrame");
            if (c12412 != null) {
                int[] iArr = (int[]) c12412.m3029(this.f4562);
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
                C1249 c1249M3025 = C1249.m3025(i5, this.f4562);
                C1249 c1249M3026 = C1249.m3025(i6, this.f4562);
                mapArr[0].put("ImageWidth", c1249M3025);
                mapArr[0].put("ImageLength", c1249M3026);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3039(C1248 c1248) throws Throwable {
        if (f4528) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c1248);
        }
        c1248.f4515 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f4537;
        c1248.m3022(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c1248.readInt();
                byte[] bArr2 = new byte[4];
                if (c1248.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f4539)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f4540)) {
                    return;
                }
                if (Arrays.equals(bArr2, f4538)) {
                    byte[] bArr3 = new byte[i];
                    if (c1248.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC1467.m3263(bArr2));
                    }
                    int i3 = c1248.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f4564 = i2;
                        m3048(0, bArr3);
                        m3054();
                        m3051(new C1248(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c1248.m3022(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3040(C1248 c1248) throws Throwable {
        boolean z = f4528;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c1248);
        }
        c1248.m3022(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c1248.read(bArr);
        c1248.read(bArr2);
        c1248.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c1248.m3022(i - c1248.f4516);
        c1248.read(bArr4);
        m3036(new C1248(bArr4), i, 5);
        c1248.m3022(i3 - c1248.f4516);
        c1248.f4515 = ByteOrder.BIG_ENDIAN;
        int i4 = c1248.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c1248.readUnsignedShort();
            int unsignedShort2 = c1248.readUnsignedShort();
            if (unsignedShort == f4547.f4522) {
                short s = c1248.readShort();
                short s2 = c1248.readShort();
                C1249 c1249M3025 = C1249.m3025(s, this.f4562);
                C1249 c1249M3026 = C1249.m3025(s2, this.f4562);
                HashMap[] mapArr = this.f4560;
                mapArr[0].put("ImageLength", c1249M3025);
                mapArr[0].put("ImageWidth", c1249M3026);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            c1248.m3022(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m3041(C1252 c1252) throws Throwable {
        m3046(c1252);
        m3049(c1252, 0);
        m3053(c1252, 0);
        m3053(c1252, 5);
        m3053(c1252, 4);
        m3054();
        if (this.f4559 == 8) {
            HashMap[] mapArr = this.f4560;
            C1249 c1249 = (C1249) mapArr[1].get("MakerNote");
            if (c1249 != null) {
                C1252 c1253 = new C1252(c1249.f4521);
                c1253.f4515 = this.f4562;
                c1253.m3022(6);
                m3049(c1253, 9);
                C1249 c12410 = (C1249) mapArr[9].get("ColorSpace");
                if (c12410 != null) {
                    mapArr[1].put("ColorSpace", c12410);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3042(C1252 c1252) throws Throwable {
        if (f4528) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c1252);
        }
        m3041(c1252);
        HashMap[] mapArr = this.f4560;
        C1249 c1249 = (C1249) mapArr[0].get("JpgFromRaw");
        if (c1249 != null) {
            m3036(new C1248(c1249.f4521), (int) c1249.f4520, 5);
        }
        C1249 c12410 = (C1249) mapArr[0].get("ISO");
        C1249 c12411 = (C1249) mapArr[1].get("PhotographicSensitivity");
        if (c12410 == null || c12411 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c12410);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m3043(C1248 c1248) throws Throwable {
        if (f4528) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c1248);
        }
        c1248.f4515 = ByteOrder.LITTLE_ENDIAN;
        c1248.m3022(f4541.length);
        int i = c1248.readInt() + 8;
        byte[] bArr = f4542;
        c1248.m3022(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c1248.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c1248.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f4543, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c1248.read(bArr3) == i2) {
                        this.f4564 = i3;
                        m3048(0, bArr3);
                        m3051(new C1248(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC1467.m3263(bArr2));
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
                c1248.m3022(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3044(C1248 c1248, HashMap map) throws Throwable {
        C1249 c1249 = (C1249) map.get("JPEGInterchangeFormat");
        C1249 c12410 = (C1249) map.get("JPEGInterchangeFormatLength");
        if (c1249 == null || c12410 == null) {
            return;
        }
        int iM3027 = c1249.m3027(this.f4562);
        int iM3028 = c12410.m3027(this.f4562);
        if (this.f4559 == 7) {
            iM3027 += this.f4565;
        }
        if (iM3027 > 0 && iM3028 > 0 && this.f4558 == null && this.f4557 == null) {
            c1248.skip(iM3027);
            c1248.read(new byte[iM3028]);
        }
        if (f4528) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM3027 + ", length: " + iM3028);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final boolean m3045(HashMap map) {
        C1249 c1249 = (C1249) map.get("ImageLength");
        C1249 c12410 = (C1249) map.get("ImageWidth");
        if (c1249 == null || c12410 == null) {
            return false;
        }
        return c1249.m3027(this.f4562) <= 512 && c12410.m3027(this.f4562) <= 512;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m3046(C1252 c1252) throws IOException {
        ByteOrder byteOrderM3031 = m3031(c1252);
        this.f4562 = byteOrderM3031;
        c1252.f4515 = byteOrderM3031;
        int unsignedShort = c1252.readUnsignedShort();
        int i = this.f4559;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c1252.readInt();
        if (i2 < 8) {
            throw new IOException(AbstractC1095.m2794(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c1252.m3022(i3);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m3047() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f4560;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM2802 = AbstractC1095.m2802(i, "The size of tag group[", "]: ");
            sbM2802.append(mapArr[i].size());
            Log.d("ExifInterface", sbM2802.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C1249 c1249 = (C1249) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c1249.toString() + ", tagValue: '" + c1249.m3028(this.f4562) + "'");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m3048(int i, byte[] bArr) throws IOException {
        C1252 c1252 = new C1252(bArr);
        m3046(c1252);
        m3049(c1252, i);
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
    public final void m3049(C1252 c1252, int i) throws IOException {
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
        Integer numValueOf = Integer.valueOf(c1252.f4516);
        HashSet hashSet = this.f4561;
        hashSet.add(numValueOf);
        short s = c1252.readShort();
        boolean z2 = f4528;
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s));
        }
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            mapArr = this.f4560;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = c1252.readUnsignedShort();
            int unsignedShort3 = c1252.readUnsignedShort();
            int i5 = c1252.readInt();
            long j6 = ((long) c1252.f4516) + 4;
            C1250 c1250 = (C1250) f4550[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c1250 != null ? c1250.f4523 : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            }
            if (c1250 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f4545;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = c1250.f4524;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = c1250.f4525) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
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
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f4544[unsignedShort3] + ") is unexpected for tag: " + c1250.f4523);
                        }
                    }
                    if (z) {
                        j3 = j;
                        if (j2 > 4) {
                            i4 = c1252.readInt();
                            if (z2 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i4);
                            }
                            if (this.f4559 == 7) {
                                if ("MakerNote".equals(c1250.f4523)) {
                                    this.f4565 = i4;
                                } else if (i != 6 && "ThumbnailImage".equals(c1250.f4523)) {
                                    this.f4566 = i4;
                                    this.f4567 = i5;
                                    C1249 c1249M3025 = C1249.m3025(6, this.f4562);
                                    C1249 c1249M3023 = C1249.m3023(this.f4566, this.f4562);
                                    C1249 c1249M3024 = C1249.m3023(this.f4567, this.f4562);
                                    mapArr[4].put("Compression", c1249M3025);
                                    mapArr[4].put("JPEGInterchangeFormat", c1249M3023);
                                    mapArr[4].put("JPEGInterchangeFormatLength", c1249M3024);
                                }
                            }
                            c1252.m3030(i4);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            unsignedShort3 = unsignedShort3;
                        }
                        num = (Integer) f4553.get(Integer.valueOf(unsignedShort2));
                        if (z2 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            i3 = unsignedShort3;
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    j5 = ((long) c1252.readInt()) & 4294967295L;
                                } else if (i3 == 8) {
                                    unsignedShort = c1252.readShort();
                                } else if (i3 != 9 || i3 == 13) {
                                    unsignedShort = c1252.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z2 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1250.f4523));
                                }
                                if (j5 > 0) {
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        c1252.m3030(j5);
                                        m3049(c1252, num.intValue());
                                    } else if (z2 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                                }
                                c1252.m3030(j3);
                            } else {
                                unsignedShort = c1252.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1250.f4523));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    c1252.m3030(j5);
                                    m3049(c1252, num.intValue());
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            c1252.m3030(j3);
                        } else {
                            j4 = j3;
                            int i7 = c1252.f4516 + this.f4564;
                            byte[] bArr = new byte[(int) j2];
                            c1252.readFully(bArr);
                            C1249 c1249 = new C1249(i7, bArr, unsignedShort3, i5);
                            HashMap map = mapArr[i];
                            str = c1250.f4523;
                            map.put(str, c1249);
                            if ("DNGVersion".equals(str)) {
                                this.f4559 = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && c1249.m3028(this.f4562).contains("PENTAX")) || ("Compression".equals(str) && c1249.m3027(this.f4562) == 65535)) {
                                this.f4559 = 8;
                            }
                            if (c1252.f4516 != j4) {
                                c1252.m3030(j4);
                            }
                        }
                    } else {
                        c1252.m3030(j);
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
                    c1252.m3030(j);
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i4 = c1252.readInt();
                        if (z2 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i4);
                        }
                        if (this.f4559 == 7) {
                            if ("MakerNote".equals(c1250.f4523)) {
                                this.f4565 = i4;
                            } else if (i != 6) {
                            }
                        }
                        c1252.m3030(i4);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        unsignedShort3 = unsignedShort3;
                    }
                    num = (Integer) f4553.get(Integer.valueOf(unsignedShort2));
                    if (z2 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        i3 = unsignedShort3;
                        if (i3 != 3) {
                            if (i3 == 4) {
                                j5 = ((long) c1252.readInt()) & 4294967295L;
                            } else if (i3 == 8) {
                                if (i3 != 9) {
                                }
                                unsignedShort = c1252.readInt();
                            } else {
                                unsignedShort = c1252.readShort();
                            }
                            if (z2 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1250.f4523));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    c1252.m3030(j5);
                                    m3049(c1252, num.intValue());
                                } else if (z2 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            c1252.m3030(j3);
                        } else {
                            unsignedShort = c1252.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1250.f4523));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                c1252.m3030(j5);
                                m3049(c1252, num.intValue());
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        c1252.m3030(j3);
                    } else {
                        j4 = j3;
                        int i8 = c1252.f4516 + this.f4564;
                        byte[] bArr2 = new byte[(int) j2];
                        c1252.readFully(bArr2);
                        C1249 c12410 = new C1249(i8, bArr2, unsignedShort3, i5);
                        HashMap map2 = mapArr[i];
                        str = c1250.f4523;
                        map2.put(str, c12410);
                        if ("DNGVersion".equals(str)) {
                            this.f4559 = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f4559 = 8;
                        if (c1252.f4516 != j4) {
                            c1252.m3030(j4);
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
                c1252.m3030(j);
            } else {
                j3 = j;
                if (j2 > 4) {
                    i4 = c1252.readInt();
                    if (z2 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i4);
                    }
                    if (this.f4559 == 7) {
                        if ("MakerNote".equals(c1250.f4523)) {
                            this.f4565 = i4;
                        } else if (i != 6) {
                        }
                    }
                    c1252.m3030(i4);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    unsignedShort3 = unsignedShort3;
                }
                num = (Integer) f4553.get(Integer.valueOf(unsignedShort2));
                if (z2 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    i3 = unsignedShort3;
                    if (i3 != 3) {
                        if (i3 == 4) {
                            j5 = ((long) c1252.readInt()) & 4294967295L;
                        } else if (i3 == 8) {
                            if (i3 != 9) {
                            }
                            unsignedShort = c1252.readInt();
                        } else {
                            unsignedShort = c1252.readShort();
                        }
                        if (z2 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1250.f4523));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                c1252.m3030(j5);
                                m3049(c1252, num.intValue());
                            } else if (z2 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        c1252.m3030(j3);
                    } else {
                        unsignedShort = c1252.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z2 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c1250.f4523));
                    }
                    if (j5 > 0) {
                        if (!hashSet.contains(Integer.valueOf((int) j5))) {
                            c1252.m3030(j5);
                            m3049(c1252, num.intValue());
                        } else if (z2 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                        }
                    } else if (z2 != 0) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                    }
                    c1252.m3030(j3);
                } else {
                    j4 = j3;
                    int i9 = c1252.f4516 + this.f4564;
                    byte[] bArr3 = new byte[(int) j2];
                    c1252.readFully(bArr3);
                    C1249 c12411 = new C1249(i9, bArr3, unsignedShort3, i5);
                    HashMap map3 = mapArr[i];
                    str = c1250.f4523;
                    map3.put(str, c12411);
                    if ("DNGVersion".equals(str)) {
                        this.f4559 = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f4559 = 8;
                    if (c1252.f4516 != j4) {
                        c1252.m3030(j4);
                    }
                }
            }
            s2 = (short) (s2 + 1);
            s = s;
            z2 = z2;
        }
        boolean z3 = z2;
        int i10 = c1252.readInt();
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
        c1252.m3030(j7);
        if (mapArr[4].isEmpty()) {
            m3049(c1252, 4);
        } else if (mapArr[5].isEmpty()) {
            m3049(c1252, 5);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void m3050(int i, String str, String str2) {
        HashMap[] mapArr = this.f4560;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m3051(C1248 c1248) throws Throwable {
        C1249 c1249;
        int iM3027;
        HashMap map = this.f4560[4];
        C1249 c12410 = (C1249) map.get("Compression");
        if (c12410 == null) {
            m3044(c1248, map);
            return;
        }
        int iM3028 = c12410.m3027(this.f4562);
        if (iM3028 != 1) {
            if (iM3028 == 6) {
                m3044(c1248, map);
                return;
            } else if (iM3028 != 7) {
                return;
            }
        }
        C1249 c12411 = (C1249) map.get("BitsPerSample");
        if (c12411 != null) {
            int[] iArr = (int[]) c12411.m3029(this.f4562);
            int[] iArr2 = f4529;
            if (Arrays.equals(iArr2, iArr) || (this.f4559 == 3 && (c1249 = (C1249) map.get("PhotometricInterpretation")) != null && (((iM3027 = c1249.m3027(this.f4562)) == 1 && Arrays.equals(iArr, f4530)) || (iM3027 == 6 && Arrays.equals(iArr, iArr2))))) {
                C1249 c12412 = (C1249) map.get("StripOffsets");
                C1249 c12413 = (C1249) map.get("StripByteCounts");
                if (c12412 == null || c12413 == null) {
                    return;
                }
                long[] jArrM3268 = AbstractC1467.m3268(c12412.m3029(this.f4562));
                long[] jArrM3269 = AbstractC1467.m3268(c12413.m3029(this.f4562));
                if (jArrM3268 == null || jArrM3268.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM3269 == null || jArrM3269.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM3268.length != jArrM3269.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrM3269) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f4563 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM3268.length; i3++) {
                    int i4 = (int) jArrM3268[i3];
                    int i5 = (int) jArrM3269[i3];
                    if (i3 < jArrM3268.length - 1 && i4 + i5 != jArrM3268[i3 + 1]) {
                        this.f4563 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (c1248.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (c1248.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.f4563) {
                    long j4 = jArrM3268[0];
                    return;
                }
                return;
            }
        }
        if (f4528) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void m3052(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f4560;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = f4528;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C1249 c1249 = (C1249) mapArr[i].get("ImageLength");
        C1249 c12410 = (C1249) mapArr[i].get("ImageWidth");
        C1249 c12411 = (C1249) mapArr[i2].get("ImageLength");
        C1249 c12412 = (C1249) mapArr[i2].get("ImageWidth");
        if (c1249 == null || c12410 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c12411 == null || c12412 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM3027 = c1249.m3027(this.f4562);
        int iM3028 = c12410.m3027(this.f4562);
        int iM3029 = c12411.m3027(this.f4562);
        int iM30210 = c12412.m3027(this.f4562);
        if (iM3027 >= iM3029 || iM3028 >= iM30210) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void m3053(C1252 c1252, int i) throws Throwable {
        C1249 c1249M3025;
        C1249 c1249M3026;
        HashMap[] mapArr = this.f4560;
        C1249 c1249 = (C1249) mapArr[i].get("DefaultCropSize");
        C1249 c12410 = (C1249) mapArr[i].get("SensorTopBorder");
        C1249 c12411 = (C1249) mapArr[i].get("SensorLeftBorder");
        C1249 c12412 = (C1249) mapArr[i].get("SensorBottomBorder");
        C1249 c12413 = (C1249) mapArr[i].get("SensorRightBorder");
        if (c1249 != null) {
            if (c1249.f4518 == 5) {
                C1251[] c1251Arr = (C1251[]) c1249.m3029(this.f4562);
                if (c1251Arr == null || c1251Arr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c1251Arr));
                    return;
                }
                c1249M3025 = C1249.m3024(c1251Arr[0], this.f4562);
                c1249M3026 = C1249.m3024(c1251Arr[1], this.f4562);
            } else {
                int[] iArr = (int[]) c1249.m3029(this.f4562);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c1249M3025 = C1249.m3025(iArr[0], this.f4562);
                c1249M3026 = C1249.m3025(iArr[1], this.f4562);
            }
            mapArr[i].put("ImageWidth", c1249M3025);
            mapArr[i].put("ImageLength", c1249M3026);
            return;
        }
        if (c12410 != null && c12411 != null && c12412 != null && c12413 != null) {
            int iM3027 = c12410.m3027(this.f4562);
            int iM3028 = c12412.m3027(this.f4562);
            int iM3029 = c12413.m3027(this.f4562);
            int iM30210 = c12411.m3027(this.f4562);
            if (iM3028 <= iM3027 || iM3029 <= iM30210) {
                return;
            }
            C1249 c1249M3027 = C1249.m3025(iM3028 - iM3027, this.f4562);
            C1249 c1249M3028 = C1249.m3025(iM3029 - iM30210, this.f4562);
            mapArr[i].put("ImageLength", c1249M3027);
            mapArr[i].put("ImageWidth", c1249M3028);
            return;
        }
        C1249 c12414 = (C1249) mapArr[i].get("ImageLength");
        C1249 c12415 = (C1249) mapArr[i].get("ImageWidth");
        if (c12414 == null || c12415 == null) {
            C1249 c12416 = (C1249) mapArr[i].get("JPEGInterchangeFormat");
            C1249 c12417 = (C1249) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c12416 == null || c12417 == null) {
                return;
            }
            int iM30211 = c12416.m3027(this.f4562);
            int iM30212 = c12416.m3027(this.f4562);
            c1252.m3030(iM30211);
            byte[] bArr = new byte[iM30212];
            c1252.read(bArr);
            m3036(new C1248(bArr), iM30211, i);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m3054() throws Throwable {
        m3052(0, 5);
        m3052(0, 4);
        m3052(5, 4);
        HashMap[] mapArr = this.f4560;
        C1249 c1249 = (C1249) mapArr[1].get("PixelXDimension");
        C1249 c12410 = (C1249) mapArr[1].get("PixelYDimension");
        if (c1249 != null && c12410 != null) {
            mapArr[0].put("ImageWidth", c1249);
            mapArr[0].put("ImageLength", c12410);
        }
        if (mapArr[4].isEmpty() && m3045(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m3045(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m3050(0, "ThumbnailOrientation", "Orientation");
        m3050(0, "ThumbnailImageLength", "ImageLength");
        m3050(0, "ThumbnailImageWidth", "ImageWidth");
        m3050(5, "ThumbnailOrientation", "Orientation");
        m3050(5, "ThumbnailImageLength", "ImageLength");
        m3050(5, "ThumbnailImageWidth", "ImageWidth");
        m3050(4, "Orientation", "ThumbnailOrientation");
        m3050(4, "ImageLength", "ThumbnailImageLength");
        m3050(4, "ImageWidth", "ThumbnailImageWidth");
    }
}

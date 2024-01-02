package common.constants;

import static util.PropertyFileReader.getPropertyValue;


public class AdressConstants {
    // Login Data Property File Path
    public static final String ADDRESS_DATA_PROPERTY_FILE_PATH = "test_data/address_data.properties";

    // Login Credentials
    public static final String LOCATION = getPropertyValue(ADDRESS_DATA_PROPERTY_FILE_PATH, "location");
    public static final String LABEL_ALAMAT = getPropertyValue(ADDRESS_DATA_PROPERTY_FILE_PATH, "label_alamat");
    public static final String ALAMAT_LENGKAP = getPropertyValue(ADDRESS_DATA_PROPERTY_FILE_PATH, "alamat_lengkap");
    public static final String CATATAN = getPropertyValue(ADDRESS_DATA_PROPERTY_FILE_PATH, "catatan");
    public static final String NAMA_PENERIMA = getPropertyValue(ADDRESS_DATA_PROPERTY_FILE_PATH, "nama_penerima");
    public static final String NOMOR_HP = getPropertyValue(ADDRESS_DATA_PROPERTY_FILE_PATH, "nomor_hp");
}

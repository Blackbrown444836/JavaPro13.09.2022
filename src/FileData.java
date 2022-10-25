
public record FileData (String fileName, double sizeInBytes, String puchOfFile){
    @Override
    public double sizeInBytes() {
        return sizeInBytes;
    }

    @Override
    public String puchOfFile() {
        return puchOfFile;
    }

    @Override
    public String fileName() {
        return fileName;
    }
}



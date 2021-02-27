## open close principle

we only allow a class to extends its behaviour , but we cannot give a permission to modify class or components.

ex: when a stable product is relesed, no one want to modify this, they are try to add feature with alternative way....

Class A //well written code where one method doSomething()

b extends A //for further development


strangler pattern


#### ex

## FileCompressor.java
```java
import java.io.File;
import java.util.List;

public interface FileCompressor {
	void compress(List<File> file);
}
```

## ZipFileCompressor.java
```java
import java.io.File;
import java.util.List;

public class ZipFileCompressor implements FileCompressor{

	@Override
	public void compress(List<File> file) {
		System.out.println("Compressing file with zip algorithms");
	}
}
```

## RarFileCompressor.java
```java
import java.io.File;
import java.util.List;
@Deprecated //caution Deprecated
public class RarFileCompressor implements FileCompressor{

	@Override
	public void compress(List<File> file) {
		System.out.println("Compressing file wwith rar algorithms.... ");
	}
}
```

## SevenZipCompressor.java
```java
import java.io.File;
import java.util.List;

public class SevenZipCompressor implements FileCompressor{

	@Override
	public void compress(List<File> file) {
		System.out.println("Compressing file with 7 zip algorithms");
	}
}
```

## FileCompressorContext.java
```java
import java.io.File;
import java.util.List;

public class FileCompressorContext {
	private FileCompressor compressor;
	
	public void setCompressor(FileCompressor compressor) {
		this.compressor = compressor;
	}
	
	public void archive(List<File> file) {
		if (compressor == null) {
			throw new RuntimeException("No compressor has been set yet");
		}
		compressor.compress(file);
	}
}
```

## Client.java
```java
import java.util.ArrayList;

public class Client {

	public static void rotateDigit(String[] args) {
		FileCompressorContext fileCompressorContext = new FileCompressorContext();
		
		//fileCompressorContext.setCompressor(new ZipFileCompressor());
		//fileCompressorContext.setCompressor(new RarFileCompressor());
		fileCompressorContext.setCompressor(new SevenZipCompressor());
		
		fileCompressorContext.archive(new ArrayList<>());
	}
}
```

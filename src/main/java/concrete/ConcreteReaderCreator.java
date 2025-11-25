package concrete;

import java.util.NoSuchElementException;

public class ConcreteReaderCreator extends ReaderCreator {

	@Override
	protected Reader createReader(DataType dataType) {

		return switch (dataType) {
		case TEXT -> new TextFileReader();
		case POEM -> new PoemReader();
		case BINARY -> new ByTenBytesReader();
		case SYSLOG -> new SystemLogsReader();
		default -> throw new NoSuchElementException();
		};
	}

}

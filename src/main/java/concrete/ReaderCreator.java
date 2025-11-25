package concrete;

public abstract class ReaderCreator {

	public Reader createPreparedReader(DataType dataType, Object data) {

		Reader reader = createReader(dataType);
		reader.setDataSource(data);
		reader.setPosition(0);
		return reader;
	}

	protected abstract Reader createReader(DataType dataType);
}

package DisruptorSample;import com.lmax.disruptor.EventHandler;import com.lmax.disruptor.WorkHandler;/** * Created with IntelliJ IDEA. * Project: mobile-tracer-web * Author: Kevin * Date: 16/5/23 * Time: 下午4:11 */public class TestObjectHandler implements EventHandler<TestObject>,WorkHandler<TestObject> {	@Override	public void onEvent(TestObject event, long sequence, boolean endOfBatch) throws Exception {		this.onEvent(event);	}	@Override	public void onEvent(TestObject event) throws Exception {		System.out.println(event.getValue());	}	public static void main(String[] args) {		System.out.println(Integer.bitCount(3));	}}
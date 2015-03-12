package hu.bme.diploma.a7e7yk.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.client.HConnection;
import org.apache.hadoop.hbase.client.HConnectionManager;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class HBaseFirst {
	static final String UBUNTU_IP ="192.168.227.129";
	static final byte[] test_table =Bytes.toBytes("test_table");
	static final byte[] column_family = Bytes.toBytes("data");

	@SuppressWarnings("deprecation")
	public HBaseFirst() {
		Configuration conf = HBaseConfiguration.create();
		conf.set("hbase.zookeeper.quorum", UBUNTU_IP);
		try {
			System.out.println("HTable manager");
			HTable table = new HTable(conf, test_table);
			System.out.println("New Put obejct");
			Put p = new Put(Bytes.toBytes("row1"));
			p.add(column_family,Bytes.toBytes("col1"),Bytes.toBytes("value1"));
			table.put(p);
			
			table.flushCommits();
			System.out.println("-- FLUSHED ---");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[]) {
		new HBaseFirst();
	}
	
}

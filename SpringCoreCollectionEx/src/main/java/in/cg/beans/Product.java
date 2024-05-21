package in.cg.beans;

import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Product {
	private int pid;
	private String pcode;
	
	private Set<String> colors;
	private List<Integer> pdimensions;

}

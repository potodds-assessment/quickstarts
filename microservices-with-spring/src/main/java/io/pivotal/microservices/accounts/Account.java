package io.pivotal.microservices.accounts;

import java.io.Serializable;
import javax.persistence.Id;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	public static Long nextId = 0L;

	@Id
	protected Long id;

}
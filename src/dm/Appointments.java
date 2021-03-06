package dm;

import java.io.Serializable;

/**
 * This class provides a data model type to store the fields of the appointments resource returned by
 * the Companies House API.
 *
 * @author nrowell
 * @version $Id$
 */
public class Appointments implements Serializable {
	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = -1117410266918257839L;

	/**
	 * Housekeeping field returned by query.
	 */
	public int items_per_page;
	/**
	 * Housekeeping field returned by query.
	 */
	public int start_index;
	/**
	 * Housekeeping field returned by query.
	 */
	public int total_results;
	/**
	 * Data type returned by query.
	 */
	public String kind;
	/**
	 * Is corporate officer.
	 */
	public boolean is_corporate_officer;
	/**
	 * Date of birth.
	 */
	public DateYMD date_of_birth;
	/**
	 * The ETag of the resource, e.g. "6ff8a51bb8763c3b49bff68e9e621f8007ad8a80"
	 */
	public String etag;
	/**
	 * Links to relevant URL resources.
	 */
	public Links links;
	/**
	 * The officer's name.
	 */
	public String name;
	/**
	 * The array of all appointments.
	 */
	public Appointment[] items;
	
}
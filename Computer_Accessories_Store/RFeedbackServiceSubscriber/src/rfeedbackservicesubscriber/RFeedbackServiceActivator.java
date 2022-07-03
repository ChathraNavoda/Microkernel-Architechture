package rfeedbackservicesubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import rfeedbackservicepublisher.RFeedbackServicePublish;

public class RFeedbackServiceActivator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {

		System.out.println("");
		serviceReference = context.getServiceReference(RFeedbackServicePublish.class.getName());
		RFeedbackServicePublish servicePublish = (RFeedbackServicePublish) context.getService(serviceReference);
		servicePublish.getCustomerFeedback();
		
	}

	public void stop(BundleContext context) throws Exception {

		System.out.println("end");
		context.ungetService(serviceReference);
		
	}

}

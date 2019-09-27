package com.techlabs.case2;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public interface IPublisher extends ActionListener, ItemListener {

	Color getStateChange();
}

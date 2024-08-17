package _08_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */

public class CaliforniaWeather implements ActionListener {

	HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();       
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton cityButton = new JButton();
	JButton weatherConditionButton = new JButton();
	JButton minMaxButton = new JButton();

	void start() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cityButton.addActionListener(this);
		weatherConditionButton.addActionListener(this);
		minMaxButton.addActionListener(this);

		frame.setTitle("California Weather");

		cityButton.setText("Enter a city");
		weatherConditionButton.setText("Enter a weather condition");
		minMaxButton.setText("Enter a minimum and maximum temperature");

		panel.add(cityButton);
		panel.add(weatherConditionButton);
		panel.add(minMaxButton);

		frame.add(panel);

		frame.pack();

		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		JButton buttonClicked = (JButton)arg0.getSource();

		//button 1 is clicked
		if(cityButton == buttonClicked) {
			
			// All city keys have the first letter capitalized of each word

			String cityInput = JOptionPane.showInputDialog("Enter a city in California.");

			String cityName = Utilities.capitalizeWords(cityInput);
			WeatherData datum = weatherData.get(cityName);

			if( datum == null ) {
				JOptionPane.showMessageDialog(null, "Unable to find weather data for: " + cityName);
			} else {
				JOptionPane.showMessageDialog(null, cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
			}

		}

		//button 2 is clicked
		else if(weatherConditionButton == buttonClicked) {

			String weatherConditionInput = JOptionPane.showInputDialog("Enter a weather condition.");

			String citiesWithGivenConditionList = "";
			 for(String i : weatherData.keySet()){
				if(weatherData.get(i).weatherSummary.equalsIgnoreCase(weatherConditionInput)) {
				citiesWithGivenConditionList += i + "\n";
				}
			}

			JOptionPane.showMessageDialog(null, citiesWithGivenConditionList);
			
		}
		
		//button 3 is clicked
		else {
			
			String minTempInput = JOptionPane.showInputDialog("Enter a minimum temperature.");
			String maxTempInput = JOptionPane.showInputDialog("Enter a maximum temperature.");

			String citiesWithTempInRangeList = "";
			 for(String i : weatherData.keySet()){
				 System.out.println("j");
				if(weatherData.get(i).temperatureF >= Integer.parseInt(minTempInput) && weatherData.get(i).temperatureF <= Integer.parseInt(maxTempInput)) {
				citiesWithTempInRangeList += i + "\n";
				}
			}

			JOptionPane.showMessageDialog(null, citiesWithTempInRangeList);
			
		}
	}


}

package sineplot;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;


public class sineplot {
    public static void main(String[] args) {
        // Create a sine wave data series
        XYSeries series = new XYSeries("Sine Wave");
        for (double x = -Math.PI; x <= Math.PI; x += 0.1) {
            series.add(x, Math.sin(x));
        }

        // Create a dataset with the sine wave series
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        // Create a chart
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Sine Wave",
                "X",
                "Y",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Create a chart panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        
        // Create a frame and add the chart panel
        JFrame frame = new JFrame("Sine Plot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}

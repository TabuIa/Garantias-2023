/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadegarantias;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import static sistemadegarantias.Configuracionserver.IMPRESORA;

/** 
 *
 * @author AGONZALEZ
 */
class FORMATOCELDAS {

    public static boolean printCard(final String bill) {
        final PrinterJob job = PrinterJob.getPrinterJob();///////////////////*********************************

        Printable contentToPrint = new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

                Graphics2D g2d = (Graphics2D) graphics;

                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                g2d.setFont(new Font("Monospaced", Font.BOLD, 9));

                String[] billz = bill.split(";");
                int y = 5;
                //draw each String in a separate line
                for (int i = 0; i < billz.length; i++) {
                    graphics.drawString(billz[i], 5, y);
                    y = y + 8;
                }

                if (pageIndex > 0) {
                    return NO_SUCH_PAGE;
                } //Only one page

                return PAGE_EXISTS;
            }

        };
        PageFormat pageFormat = new PageFormat();
        pageFormat.setOrientation(PageFormat.PORTRAIT);
        Paper pPaper = pageFormat.getPaper();

        pPaper.setImageableArea(0, 0, pPaper.getWidth(), pPaper.getHeight() - 2);
        pageFormat.setPaper(pPaper);

        job.setPrintable(contentToPrint, pageFormat);




    try {
        PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
int selectedService = 0;
/* Scan found services to see if anyone suits our needs */
String p=IMPRESORA.toString();
        System.out.println(IMPRESORA);
for(int i = 0; i < services.length;i++){
 //   System.out.println(services[i]);
     String psf=services[i].toString();
    if(p.equals(psf)){
        /*If the service is named as what we are querying we select it */
        selectedService = i;
            // System.out.println("coincidencia");
    }
        //    System.out.println("nel perro");
}
job.setPrintService(services[selectedService]);
      job.print();

  } catch (PrinterException e) {
  //  System.err.println(e.getMessage());
  }
    return true;
    }
}

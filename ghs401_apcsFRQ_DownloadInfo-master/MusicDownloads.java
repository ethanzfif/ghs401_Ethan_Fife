 

import java.util.List;
import java.util.ArrayList;

public class MusicDownloads
   {
   private List<DownloadInfo> downloadList;
   
   public MusicDownloads()
      {
      downloadList = new ArrayList<DownloadInfo>();
      downloadList.add( new DownloadInfo( "Hey Jude", 5 ) );
      downloadList.add( new DownloadInfo( "Soul Sister", 3 ) );
      downloadList.add( new DownloadInfo( "Aqualung", 10 ) );
      } // end constructor
      
   public DownloadInfo getDownloadInfo( String title )
      {
      for(int i=0; i<downloadList.size();i++){
          if(title.equals(downloadList.get(i).getTitle())){
              return downloadList.get(i);
          }      
        }
      return null;
      } // end method getDownloadInfo
      
   public void updateDownloads( List<String> titles )
         {
       for (int i=0; i<titles.size(); i++){
           DownloadInfo dInfo = getDownloadInfo(titles.get(i));
           if(dInfo != null){
               dInfo.incrementTimesDownloaded();
            }
            else{
                DownloadInfo song = new DownloadInfo(titles.get(i));
                downloadList.add(song);
            }
       }
      } // end method updateDownloads
      
   public String toString()
      {
      String musicDownloads = new String( "" );
      
      for( DownloadInfo item : downloadList )
         {
         musicDownloads = musicDownloads + item;    
         } // end for each
         
      return musicDownloads;
      } // end toString
   } // end class MusicDownloads
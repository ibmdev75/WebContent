// This file has been automatically generated.
// Generation date : Sun Mar 15 00:58:07 CET 2015
package generated;
   
   
import java.text.*;
import java.util.*;
import org.apache.oro.text.regex.*;
import com.jalios.jcms.*;
import com.jalios.jcms.handler.*;
import com.jalios.util.ObjectIntTreeMap;
import com.jalios.util.Util;
import custom.*;
@SuppressWarnings({"unchecked", "unused"})
public class EditDossierThematiqueHandler extends EditPublicationHandler {
   
  protected DossierThematique theContent;
  
  public Class getPublicationClass() {
    return DossierThematique.class;
  }
  
  // ----------------------------------------------------------------------
  // validateBeforeOpDossierThematique  
  // ----------------------------------------------------------------------
  
  public boolean validateBeforeOp() {
    if (!super.validateBeforeOp()) {
      return false;
    }
    
    Member fdauthor = getLoggedMember();
    
           fdauthor = (fdauthor == null) ? getAvailableAuthor() : fdauthor;
    
    
    {
      List list = processDataIds("lienArticle",__lienArticleStr,generated.Article.class);
      this.lienArticle = (generated.Article[])list.toArray(new generated.Article[0]);
    }
    if (!validateUploadedFileDocument(getAvailableLienArticle(),   fdauthor, getAvailableWorkspace())) {
      return false;
    }
    if (!createUploadedFileDocument(getAvailableLienArticle(),  fdauthor, getAvailableWorkspace())) {
      return false;
    }
    return true;
  }
  @Override
  public Object getAvailableField(String field) {
  
    if ("titreAffiche".equals(field)) {
      return getAllAvailableTitreAfficheML();
    }
    
    if ("description".equals(field)) {
      return getAllAvailableDescriptionML();
    }
    
    if ("image".equals(field)) {
      return getAllAvailableImageML();
    }
    
    if ("contenu".equals(field)) {
      return getAllAvailableContenuML();
    }
    
    if ("lienArticle".equals(field)) {
      return getAvailableLienArticle();
    }
    
    return super.getAvailableField(field);
  }
  @Override
  public Object getEnumValues(String field) {
  
    return super.getEnumValues(field);
  }
  @Override
  public Object getEnumLabels(String field, String userLang) {
  
    return super.getEnumLabels(field, userLang);
  }
  // ----------------------------------------------------------------------
  // validateCommonCreateUpdateDossierThematique  
  // ----------------------------------------------------------------------
  public boolean validateCommonCreateUpdateDossierThematique() {
    return true;
  }
  
  // ----------------------------------------------------------------------
  // Create
  // ----------------------------------------------------------------------
  public boolean validateCreate() throws java.io.IOException {
    if (!super.validateCreate()) {
      return false;
    }
    if (!validateCommonCreateUpdateDossierThematique()) {
      return false;
    }
    return true;
  }
  
  // ----------------------------------------------------------------------
  // Update
  // ----------------------------------------------------------------------
  public boolean validateUpdate() throws java.io.IOException {
    if (!super.validateUpdate()) {
      return false;
    }
    
    if (!validateCommonCreateUpdateDossierThematique()) {
      return false;
    }
    
    return true;
  }
 
  // ----------------------------------------------------------------------
  // Next
  // ----------------------------------------------------------------------
  protected boolean validateNext() throws java.io.IOException {
   if (!super.validateNext()) {
      return false;
    }
	return true;
  }
  // ----------------------------------------------------------------------
  // Previous
  // ----------------------------------------------------------------------
  protected boolean validatePrevious() throws java.io.IOException {
  	if (!super.validatePrevious()) {
      return false;
    }
	return true;
  }
  // ----------------------------------------------------------------------
  // Finish
  // ----------------------------------------------------------------------
  protected boolean validateFinish() throws java.io.IOException {
  	if (!super.validateFinish()) {
      return false;
    }
	return true;
  }
  // ----------------------------------------------------------------------
  // setFields
  // ----------------------------------------------------------------------
  public void setFields(Publication data) {
    super.setFields(data);
    DossierThematique obj = (DossierThematique)data;
    obj.setTitreAffiche(getAvailableTitreAffiche());
    obj.setTitreAfficheML(getAvailableTitreAfficheML());
    obj.setDescription(getAvailableDescription());
    obj.setDescriptionML(getAvailableDescriptionML());
    obj.setImage(getAvailableImage());
    obj.setImageML(getAvailableImageML());
    obj.setContenu(getAvailableContenu());
    obj.setContenuML(getAvailableContenuML());
    obj.setLienArticle(getAvailableLienArticle());
  }
  
  public void setId(String  v) {
    if (channel.getData(v) instanceof DossierThematique) {
      super.setId(v);
      theContent = (DossierThematique)publication;
    } else {
      super.setId(null);
      theContent = null;
    }
  }
  
   
  // ----------------------------------------------------------------------
  // titreAffiche
  // ----------------------------------------------------------------------  
  protected String titreAffiche = channel.getTypeFieldEntry(DossierThematique.class, "titreAffiche", true).getDefaultTextString();
  protected HashMap titreAfficheML = channel.getTypeFieldEntry(DossierThematique.class, "titreAffiche", true).getDefaultTextMap();
  public void setTitreAffiche(String[]  v) {
    titreAffiche = getMainLangValue(v, false, true);
    titreAfficheML = getMLMap(v, false, true);
  }
  public String getAvailableTitreAffiche() {
    if (theContent != null && isFieldMissing("titreAffiche")) {
      return theContent.getTitreAffiche();
    }
    return titreAffiche;
  }
  
    
  public HashMap getAllAvailableTitreAfficheML() {
    HashMap map = Util.getHashMap(getAvailableTitreAfficheML());
    map.put(channel.getLanguage(),getAvailableTitreAffiche(channel.getLanguage()));
    return map;
  }
  
  public HashMap getAvailableTitreAfficheML() {
    if (theContent != null && isFieldMissing("titreAffiche")) {
      return theContent.getTitreAfficheML();
    }
    return titreAfficheML;
  }
  public String getAvailableTitreAffiche(String lang) {
    if (theContent != null) {
      if (lang.equals(channel.getLanguage())) {
      	if (!Util.isSameContent(titreAffiche, channel.getTypeFieldEntry(DossierThematique.class, "titreAffiche", true).getDefaultTextString())) {
          return titreAffiche;
      	}
      } else {
      	if (titreAfficheML != null && Util.notEmpty((String)titreAfficheML.get(lang))) {
      	  return (String)titreAfficheML.get(lang);
      	}
      }
      return Util.getString(theContent.getTitreAffiche(lang, false), "");
    }
    if (lang.equals(channel.getLanguage())) {
      return titreAffiche;
    }
    return titreAfficheML == null ? "" : Util.getString((String)titreAfficheML.get(lang), "");
  }
  
   
  // ----------------------------------------------------------------------
  // description
  // ----------------------------------------------------------------------  
  protected String description = channel.getTypeFieldEntry(DossierThematique.class, "description", true).getDefaultTextString();
  protected HashMap descriptionML = channel.getTypeFieldEntry(DossierThematique.class, "description", true).getDefaultTextMap();
  public void setDescription(String[]  v) {
      v = WysiwygManager.cleanHtml(v, WysiwygManager.getCleanHtmlContextMap(theContent, "description"));
    description = getMainLangValue(v, true, false);
    descriptionML = getMLMap(v, true, false);
  }
  public String getAvailableDescription() {
    if (theContent != null && isFieldMissing("description")) {
      return theContent.getDescription();
    }
    return description;
  }
  
    
  public HashMap getAllAvailableDescriptionML() {
    HashMap map = Util.getHashMap(getAvailableDescriptionML());
    map.put(channel.getLanguage(),getAvailableDescription(channel.getLanguage()));
    return map;
  }
  
  public HashMap getAvailableDescriptionML() {
    if (theContent != null && isFieldMissing("description")) {
      return theContent.getDescriptionML();
    }
    return descriptionML;
  }
  public String getAvailableDescription(String lang) {
    if (theContent != null) {
      if (lang.equals(channel.getLanguage())) {
      	if (!Util.isSameContent(description, channel.getTypeFieldEntry(DossierThematique.class, "description", true).getDefaultTextString())) {
          return description;
      	}
      } else {
      	if (descriptionML != null && Util.notEmpty((String)descriptionML.get(lang))) {
      	  return (String)descriptionML.get(lang);
      	}
      }
      return Util.getString(theContent.getDescription(lang, false), "");
    }
    if (lang.equals(channel.getLanguage())) {
      return description;
    }
    return descriptionML == null ? "" : Util.getString((String)descriptionML.get(lang), "");
  }
  
   
  // ----------------------------------------------------------------------
  // image
  // ----------------------------------------------------------------------  
  protected String image = channel.getTypeFieldEntry(DossierThematique.class, "image", true).getDefaultTextString();
  protected HashMap imageML = channel.getTypeFieldEntry(DossierThematique.class, "image", true).getDefaultTextMap();
  public void setImage(String[]  v) {
    image = getMainLangValue(v, true, true);
    imageML = getMLMap(v, true, true);
  }
  public String getAvailableImage() {
    if (theContent != null && isFieldMissing("image")) {
      return theContent.getImage();
    }
    return image;
  }
  
    
  public HashMap getAllAvailableImageML() {
    HashMap map = Util.getHashMap(getAvailableImageML());
    map.put(channel.getLanguage(),getAvailableImage(channel.getLanguage()));
    return map;
  }
  
  public HashMap getAvailableImageML() {
    if (theContent != null && isFieldMissing("image")) {
      return theContent.getImageML();
    }
    return imageML;
  }
  public String getAvailableImage(String lang) {
    if (theContent != null) {
      if (lang.equals(channel.getLanguage())) {
      	if (!Util.isSameContent(image, channel.getTypeFieldEntry(DossierThematique.class, "image", true).getDefaultTextString())) {
          return image;
      	}
      } else {
      	if (imageML != null && Util.notEmpty((String)imageML.get(lang))) {
      	  return (String)imageML.get(lang);
      	}
      }
      return Util.getString(theContent.getImage(lang, false), "");
    }
    if (lang.equals(channel.getLanguage())) {
      return image;
    }
    return imageML == null ? "" : Util.getString((String)imageML.get(lang), "");
  }
  
   
  // ----------------------------------------------------------------------
  // contenu
  // ----------------------------------------------------------------------  
  protected String contenu = channel.getTypeFieldEntry(DossierThematique.class, "contenu", true).getDefaultTextString();
  protected HashMap contenuML = channel.getTypeFieldEntry(DossierThematique.class, "contenu", true).getDefaultTextMap();
  public void setContenu(String[]  v) {
      v = WysiwygManager.cleanHtml(v, WysiwygManager.getCleanHtmlContextMap(theContent, "contenu"));
    contenu = getMainLangValue(v, true, false);
    contenuML = getMLMap(v, true, false);
  }
  public String getAvailableContenu() {
    if (theContent != null && isFieldMissing("contenu")) {
      return theContent.getContenu();
    }
    return contenu;
  }
  
    
  public HashMap getAllAvailableContenuML() {
    HashMap map = Util.getHashMap(getAvailableContenuML());
    map.put(channel.getLanguage(),getAvailableContenu(channel.getLanguage()));
    return map;
  }
  
  public HashMap getAvailableContenuML() {
    if (theContent != null && isFieldMissing("contenu")) {
      return theContent.getContenuML();
    }
    return contenuML;
  }
  public String getAvailableContenu(String lang) {
    if (theContent != null) {
      if (lang.equals(channel.getLanguage())) {
      	if (!Util.isSameContent(contenu, channel.getTypeFieldEntry(DossierThematique.class, "contenu", true).getDefaultTextString())) {
          return contenu;
      	}
      } else {
      	if (contenuML != null && Util.notEmpty((String)contenuML.get(lang))) {
      	  return (String)contenuML.get(lang);
      	}
      }
      return Util.getString(theContent.getContenu(lang, false), "");
    }
    if (lang.equals(channel.getLanguage())) {
      return contenu;
    }
    return contenuML == null ? "" : Util.getString((String)contenuML.get(lang), "");
  }
  
   
  // ----------------------------------------------------------------------
  // lienArticle
  // ----------------------------------------------------------------------  
  protected generated.Article[] lienArticle = new generated.Article[0];
  protected int lienArticleAddCount = 0;
  String[] __lienArticleStr = null;
  public void setLienArticle(String[]  v) {
    __lienArticleStr = v;
  }
  public generated.Article[] getAvailableLienArticle() {
    if (theContent != null && isFieldMissing("lienArticle")) {
      if (theContent.getLienArticle() == null) {
        return lienArticle;
      }
      return theContent.getLienArticle();
    }
    return lienArticle;
  }
  
    
  
  public void setLienArticleAddCount(int  v) {
    lienArticleAddCount = v;
  }
  
  public int getLienArticleCount() {
    int arraySize = Util.getSize(getAvailableLienArticle());
    int res = 3 + arraySize + lienArticleAddCount;
    return res;
  }
 
   
 
}
// **********4A616C696F73204A434D53 *** SIGNATURE BOUNDARY ***
// jgCs9x2CEGg95t3P9vpolg==

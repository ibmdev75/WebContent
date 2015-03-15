// This file has been automatically generated.
// Generation date : Sun Mar 15 00:58:06 CET 2015
   
package generated;
import java.util.*;
import org.apache.oro.text.regex.Pattern;
import org.apache.oro.text.regex.Perl5Compiler;
import org.apache.oro.text.regex.Perl5Matcher;
import org.hibernate.Hibernate;
import com.jalios.jcms.*;
import com.jalios.jcms.db.*;
import com.jalios.jcms.mashup.*;
import com.jalios.util.*;
@SuppressWarnings({"unchecked", "unused"})
public  class DossierThematique extends com.jalios.jcms.Content 
             implements 
                com.jalios.jstore.Searchable
{
  
  // ----------------------------------------------------------------------
  // CONSTRUCTORS
  // ----------------------------------------------------------------------  
  public DossierThematique() {}
 
 
 
  
  
  
  public DossierThematique(DossierThematique other) {
    super(other);
    titreAffiche = other.titreAffiche;
    titreAfficheML = other.titreAfficheML;
    description = other.description;
    descriptionML = other.descriptionML;
    image = other.image;
    imageML = other.imageML;
    contenu = other.contenu;
    contenuML = other.contenuML;
    lienArticle = other.lienArticle;
  }
  
  // ----------------------------------------------------------------------
  // Import / Export
  // ----------------------------------------------------------------------
  public void importXml(org.jdom.Element elt, ImportOptions options) {
    super.importXml(elt, options);
    
    setImage(ImportUtil.parseFieldText(elt, "image"));
    setImageML(ImportUtil.parseFieldTextML(elt, "imageML"));
  }
  
  protected void importXmlFieldsWithReferences(org.jdom.Element elt, ImportOptions options) {
    super.importXmlFieldsWithReferences(elt, options);
      
    if (options.isSelfImport()) {
      setTitreAffiche(ImportUtil.parseFieldText(elt, "titreAffiche"));
      setTitreAfficheML(ImportUtil.parseFieldTextML(elt, "titreAfficheML"));
      setDescription(ImportUtil.parseFieldText(elt, "description"));
      setDescriptionML(ImportUtil.parseFieldTextML(elt, "descriptionML"));
      setContenu(ImportUtil.parseFieldText(elt, "contenu"));
      setContenuML(ImportUtil.parseFieldTextML(elt, "contenuML"));
      setLienArticle(ImportUtil.parseSelfFieldDataArray(elt, "lienArticle", generated.Article.class));
    } else {
    
    setTitreAfficheML(ImportUtil.parseFieldWikiML(elt, "titreAfficheML"));
    setTitreAffiche(ImportUtil.parseFieldWiki(elt, "titreAffiche"));
    setDescriptionML(ImportUtil.parseFieldWysiwygML(elt, "descriptionML"));
    setDescription(ImportUtil.parseFieldWysiwyg(elt, "description"));
    setContenuML(ImportUtil.parseFieldWysiwygML(elt, "contenuML"));
    setContenu(ImportUtil.parseFieldWysiwyg(elt, "contenu"));
    setLienArticle((generated.Article[])ImportUtil.parseFieldDataArray(elt, "lienArticle", generated.Article.class));
    }
  }
  
  public void exportXmlField(StringBuffer sb, int indentLevel) {
    super.exportXmlField(sb, indentLevel);
    sb.append(ExportUtil.exportField(indentLevel, "titreAffiche", getTitreAffiche(), "titreAfficheML", false, true));
    sb.append(ExportUtil.exportField(indentLevel, "titreAfficheML", getTitreAfficheML(), true));
    sb.append(ExportUtil.exportField(indentLevel, "description", getDescription(), "descriptionML", true, false));
    sb.append(ExportUtil.exportField(indentLevel, "descriptionML", getDescriptionML(), false));
    sb.append(ExportUtil.exportField(indentLevel, "image", getImage(), "imageML", false, true));
    sb.append(ExportUtil.exportField(indentLevel, "imageML", getImageML(), true));
    sb.append(ExportUtil.exportField(indentLevel, "contenu", getContenu(), "contenuML", false, false));
    sb.append(ExportUtil.exportField(indentLevel, "contenuML", getContenuML(), false));
    sb.append(ExportUtil.exportField(indentLevel, "lienArticle", getLienArticle()));
  }
  
  public Set<FileDocument> getDocumentLinkSet() {
    Set<FileDocument> docSet = super.getDocumentLinkSet();
    JcmsUtil.addFileDocument(docSet, image, imageML);
    return docSet;
  }
  
  // ----------------------------------------------------------------------
  // TYPE AND FIELD INFOS (static methods)
  // ----------------------------------------------------------------------  
  /**
   * Returns the TypeEntry bound to <code>DossierThematique</code>. <br>
   * @see com.jalios.jcms.Channel#getTypeEntry(Class)
   * @since jcms-5.5
   */
  public static TypeEntry getTypeEntry() {
    return channel.getTypeEntry(DossierThematique.class);
  }
  /**
   * Return an array of <code>TypeFieldEntry</code> bound to <code>DossierThematique</code>. <br>
   * This array <strong>does not</strong> contain inherited TypeFieldEntry from super classes of <code>DossierThematique</code>. <br/>
   * @return an array of <code>TypeFieldEntry</code> containing all Field used by <code>DossierThematique</code> or an empty array (never return null)
   * @see com.jalios.jcms.Channel#getTypeFieldEntries(Class)
   * @since jcms-5.5
   */
  public static TypeFieldEntry[] getTypeFieldEntries() {
    return channel.getTypeFieldEntries(DossierThematique.class);
  }
  /**
   * Return an array of <code>TypeFieldEntry</code> bound to <code>DossierThematique</code>. <br>
   * This array <strong>does</strong> contain inherited TypeFieldEntry from super classes of <code>DossierThematique</code>. <br>
   * @return an array of <code>TypeFieldEntry</code> containing all Field used by <code>DossierThematique</code> or an empty array (never return null)
   * @see com.jalios.jcms.Channel#getAllTypeFieldEntries(Class)
   * @since jcms-5.5
   */
  public static TypeFieldEntry[] getAllTypeFieldEntries() {
    return channel.getAllTypeFieldEntries(DossierThematique.class);
  }
  // ----------------------------------------------------------------------
  // FIELDs VALUE
  // ----------------------------------------------------------------------  
  /**
   * Gets the value of the given <code>int</code> field name for the current <code>DossierThematique</code>.
   * @param fieldName the field name from which to retrieve the field value.
   * @return the <code>int</code> field value
   * @throws NoSuchFieldException if the field was not found.
   */
  public int getIntFieldValue(String fieldName) throws NoSuchFieldException {
    return super.getIntFieldValue(fieldName);
  }
  
  /**
   * Sets the value of the given <code>int</code> field name for the current <code>DossierThematique</code>.
   * @param fieldName the field name from which to retrieve the field value.
   * @param value the <code>int</code> field value
   * @throws NoSuchFieldException if the field was not found.
   * @since jcms-6.3.0 
   */
  public void setIntFieldValue(String fieldName, int value) throws NoSuchFieldException {
    super.setIntFieldValue(fieldName, value);
  }
  
  /**
   * Gets the value of the given <code>long</code> field name for the current <code>DossierThematique</code>.
   * @param fieldName the field name from which to retrieve the field value.
   * @return the <code>long</code> field value
   * @throws NoSuchFieldException if the field was not found.
   */
  public long getLongFieldValue(String fieldName) throws NoSuchFieldException {
    return super.getLongFieldValue(fieldName);
  }
  
  /**
   * Sets the value of the given <code>long</code> field name for the current <code>DossierThematique</code>.
   * @param fieldName the field name from which to retrieve the field value.
   * @param value the <code>long</code> field value
   * @throws NoSuchFieldException if the field was not found.
   * @since jcms-6.3.0 
   */
  public void setLongFieldValue(String fieldName, long value) throws NoSuchFieldException {
    super.setLongFieldValue(fieldName, value);
  }
  
  /**
   * Gets the value of the given <code>double</code> field name for the current <code>DossierThematique</code>.
   * @param fieldName the field name from which to retrieve the field value.
   * @return the <code>double</code> field value
   * @throws NoSuchFieldException if the field was not found.
   */
  public double getDoubleFieldValue(String fieldName) throws NoSuchFieldException {
    return super.getDoubleFieldValue(fieldName);
  }
  
  /**
   * Sets the value of the given <code>double</code> field name for the current <code>DossierThematique</code>.
   * @param fieldName the field name from which to retrieve the field value.
   * @param value the <code>double</code> field value
   * @throws NoSuchFieldException if the field was not found.
   * @since jcms-6.3.0 
   */
  public void setDoubleFieldValue(String fieldName, double value) throws NoSuchFieldException {
     super.setDoubleFieldValue(fieldName, value);
  }
  
  /**
   * Gets the value of the given <code>boolean</code> field name for the current <code>DossierThematique</code>.
   * @param fieldName the field name from which to retrieve the field value.
   * @return the <code>boolean</code> field value
   * @throws NoSuchFieldException if the field was not found.
   */
  public boolean getBooleanFieldValue(String fieldName) throws NoSuchFieldException {
    return super.getBooleanFieldValue(fieldName);
  }
  
  /**
   * Sets the value of the given <code>boolean</code> field name for the current <code>DossierThematique</code>.
   * @param fieldName the field name from which to retrieve the field value.
   * @param value the <code>boolean</code> field value
   * @throws NoSuchFieldException if the field was not found.
   * @since jcms-6.3.0 
   */
  public void setBooleanFieldValue(String fieldName, boolean value) throws NoSuchFieldException {
    super.setBooleanFieldValue(fieldName, value);
  }
  
  /**
   * Gets the value of the given <code>Category</code> field name for the current <code>Data</code>.
   * @param fieldName the field name from which to retrieve the field value.
   * @param mbr the member used to check rigth access to categories.
   * @return a <code>TreeSet</code> of <code>Category</code>
   * @throws NoSuchFieldException if the field was not found in the given <code>Data</code>.
   */
  public TreeSet getCategoryFieldValue(String fieldName, Member mbr) throws NoSuchFieldException {
    return super.getCategoryFieldValue(fieldName, mbr);
  }
  /**
   * Gets the <code>Object</code> value of the given field name for this <code>DossierThematique</code>. <br>
   * Do not retrieve <code>Category</code> fields, see {@link #getCategoryFieldValue(String, Member)}.
   * @param fieldName the field name from which to retrieve the field value.
   * @param lang the language (ISO-639 code) in which to retrieve the field value
   *        (used only for multilingual fields).
   * @param useDefault whether to use the publication main language if the field value 
   *        is not available in the requested language (used only for multilingual fields).
   * @return the <code>Object</code> field value
   * @throws NoSuchFieldException if the field was not found in the given <code>Publication</code>.
   */
  public Object getFieldValue(String fieldName, String lang, boolean useDefault) throws NoSuchFieldException {
    if ("titreAffiche".equals(fieldName)) { return getTitreAffiche(lang, useDefault); }
    if ("description".equals(fieldName)) { return getDescription(lang, useDefault); }
    if ("image".equals(fieldName)) { return getImage(lang, useDefault); }
    if ("contenu".equals(fieldName)) { return getContenu(lang, useDefault); }
    if ("lienArticle".equals(fieldName)) { return getLienArticle(); }
    return super.getFieldValue(fieldName, lang, useDefault);
  }
  
  /**
   * Sets the <code>Object</code> value of the given field name for this <code>DossierThematique</code>. <br>
   * Do not set <code>Category</code> fields, see {@link #setCategoryFieldValue(String, TreeSet)}.
   * @param fieldName the field name from which to retrieve the field value.
   * @param value the <code>Object</code> field value
   * @param lang the language (ISO-639 code) in which to retrieve the field value
   *        (used only for multilingual fields).
   * 
   * @throws NoSuchFieldException if the field was not found in the given <code>Publication</code>.
   * @since jcms-6.3.0 
   */
  public void setFieldValue(String fieldName, Object value, String lang) throws NoSuchFieldException {
    if ("titreAffiche".equals(fieldName)) { setTitreAffiche(lang,(String)value); return; }
    if ("description".equals(fieldName)) { setDescription(lang,(String)value); return; }
    if ("image".equals(fieldName)) { setImage(lang,(String)value); return; }
    if ("contenu".equals(fieldName)) { setContenu(lang,(String)value); return; }
    if ("lienArticle".equals(fieldName)) { setLienArticle((generated.Article[])value); return; }
    super.setFieldValue(fieldName, value, lang);
  }
  
  // ----------------------------------------------------------------------
  // titreAffiche
  // ----------------------------------------------------------------------  
  protected  String titreAffiche = channel.getTypeFieldEntry(DossierThematique.class, "titreAffiche", true).getDefaultTextString();
  public String getTitreAffiche() { return titreAffiche; }
  public void setTitreAffiche(String v) { titreAffiche = v; }
  
  
  protected HashMap titreAfficheML = channel.getTypeFieldEntry(DossierThematique.class, "titreAffiche", true).getDefaultTextMap();
  public String getTitreAffiche(String lang) { return (String)channel.getLangValue(lang, true, titreAffiche, titreAfficheML, getMainLanguage()); }
  public String getTitreAffiche(String lang, boolean useDefault) { return (String)channel.getLangValue(lang, useDefault, titreAffiche, titreAfficheML, getMainLanguage()); }
  public HashMap getTitreAfficheML() { return titreAfficheML; }
  public void setTitreAfficheML(HashMap v) { titreAfficheML = v; }
  /**
   * Convenient method to set the value of the TitreAffiche field
   * in any language (default site language or any other).<br>
   * This method will set the proper field value
   * ({@link #setTitreAffiche(String)} or {@link #setTitreAfficheML(HashMap)})
   * depending on the specified language.
   * 
   * @param lang the language (ISO 639 code) in which to set the value
   * @param value the value to set.
   * @since jcms-5.7
   */
  public void setTitreAffiche(String lang, String value) {
    if (channel.getLanguage().equals(lang)) {
      titreAffiche = value;
      return;
    }
    if (titreAfficheML == null) {
      titreAfficheML = new HashMap();
    } else if (this != channel.getData(id)) {
      titreAfficheML = new HashMap<String,String>(titreAfficheML);
    }
    titreAfficheML.put(lang, value);
  }
  // ----------------------------------------------------------------------
  // description
  // ----------------------------------------------------------------------  
  protected  String description = channel.getTypeFieldEntry(DossierThematique.class, "description", true).getDefaultTextString();
  public String getDescription() { return description; }
  public void setDescription(String v) { description = v; }
  
  
  protected HashMap descriptionML = channel.getTypeFieldEntry(DossierThematique.class, "description", true).getDefaultTextMap();
  public String getDescription(String lang) { return (String)channel.getLangValue(lang, true, description, descriptionML, getMainLanguage()); }
  public String getDescription(String lang, boolean useDefault) { return (String)channel.getLangValue(lang, useDefault, description, descriptionML, getMainLanguage()); }
  public HashMap getDescriptionML() { return descriptionML; }
  public void setDescriptionML(HashMap v) { descriptionML = v; }
  /**
   * Convenient method to set the value of the Description field
   * in any language (default site language or any other).<br>
   * This method will set the proper field value
   * ({@link #setDescription(String)} or {@link #setDescriptionML(HashMap)})
   * depending on the specified language.
   * 
   * @param lang the language (ISO 639 code) in which to set the value
   * @param value the value to set.
   * @since jcms-5.7
   */
  public void setDescription(String lang, String value) {
    if (channel.getLanguage().equals(lang)) {
      description = value;
      return;
    }
    if (descriptionML == null) {
      descriptionML = new HashMap();
    } else if (this != channel.getData(id)) {
      descriptionML = new HashMap<String,String>(descriptionML);
    }
    descriptionML.put(lang, value);
  }
  // ----------------------------------------------------------------------
  // image
  // ----------------------------------------------------------------------  
  protected  String image = channel.getTypeFieldEntry(DossierThematique.class, "image", true).getDefaultTextString();
  public String getImage() { return image; }
  public void setImage(String v) { image = v; }
  
  
  protected HashMap imageML = channel.getTypeFieldEntry(DossierThematique.class, "image", true).getDefaultTextMap();
  public String getImage(String lang) { return (String)channel.getLangValue(lang, true, image, imageML, getMainLanguage()); }
  public String getImage(String lang, boolean useDefault) { return (String)channel.getLangValue(lang, useDefault, image, imageML, getMainLanguage()); }
  public HashMap getImageML() { return imageML; }
  public void setImageML(HashMap v) { imageML = v; }
  /**
   * Convenient method to set the value of the Image field
   * in any language (default site language or any other).<br>
   * This method will set the proper field value
   * ({@link #setImage(String)} or {@link #setImageML(HashMap)})
   * depending on the specified language.
   * 
   * @param lang the language (ISO 639 code) in which to set the value
   * @param value the value to set.
   * @since jcms-5.7
   */
  public void setImage(String lang, String value) {
    if (channel.getLanguage().equals(lang)) {
      image = value;
      return;
    }
    if (imageML == null) {
      imageML = new HashMap();
    } else if (this != channel.getData(id)) {
      imageML = new HashMap<String,String>(imageML);
    }
    imageML.put(lang, value);
  }
  // ----------------------------------------------------------------------
  // contenu
  // ----------------------------------------------------------------------  
  protected  String contenu = channel.getTypeFieldEntry(DossierThematique.class, "contenu", true).getDefaultTextString();
  public String getContenu() { return contenu; }
  public void setContenu(String v) { contenu = v; }
  
  
  protected HashMap contenuML = channel.getTypeFieldEntry(DossierThematique.class, "contenu", true).getDefaultTextMap();
  public String getContenu(String lang) { return (String)channel.getLangValue(lang, true, contenu, contenuML, getMainLanguage()); }
  public String getContenu(String lang, boolean useDefault) { return (String)channel.getLangValue(lang, useDefault, contenu, contenuML, getMainLanguage()); }
  public HashMap getContenuML() { return contenuML; }
  public void setContenuML(HashMap v) { contenuML = v; }
  /**
   * Convenient method to set the value of the Contenu field
   * in any language (default site language or any other).<br>
   * This method will set the proper field value
   * ({@link #setContenu(String)} or {@link #setContenuML(HashMap)})
   * depending on the specified language.
   * 
   * @param lang the language (ISO 639 code) in which to set the value
   * @param value the value to set.
   * @since jcms-5.7
   */
  public void setContenu(String lang, String value) {
    if (channel.getLanguage().equals(lang)) {
      contenu = value;
      return;
    }
    if (contenuML == null) {
      contenuML = new HashMap();
    } else if (this != channel.getData(id)) {
      contenuML = new HashMap<String,String>(contenuML);
    }
    contenuML.put(lang, value);
  }
  // ----------------------------------------------------------------------
  // lienArticle
  // ----------------------------------------------------------------------  
  protected  generated.Article[] lienArticle;
  public generated.Article[] getLienArticle() { return lienArticle; }
  public void setLienArticle(generated.Article[] v) { lienArticle = v; }
  
  
   
  // ----------------------------------------------------------------------
  // abstract
  // ----------------------------------------------------------------------  
  @Override
  public void setAbstract(String lang, String value) { setDescription(lang, value); }
  @Override
  public String getAbstract() { return description; }
  @Override
  public String getAbstract(String lang, boolean useDefault) { return getDescription(lang, useDefault); }
  @Override
  public HashMap<String,String> getAbstractML() { return getDescriptionML(); }
  public String[] getSearchStrings() {
    StringBuffer sb = new StringBuffer(super.getSearchStrings()[0]);
    sb.ensureCapacity(500 * (0 + 5 + 0 + 0) );
    if (contenu != null) {
      sb.append(contenu); sb.append(' '); 
    }
    if (contenuML != null) {
      for(Iterator it = contenuML.values().iterator(); it.hasNext();) {
        Object obj = it.next();
        if (obj != null) {
          sb.append(obj); sb.append(' ');
        }
      }
    }
    if (description != null) {
      sb.append(description); sb.append(' '); 
    }
    if (descriptionML != null) {
      for(Iterator it = descriptionML.values().iterator(); it.hasNext();) {
        Object obj = it.next();
        if (obj != null) {
          sb.append(obj); sb.append(' ');
        }
      }
    }
    if (image != null) {
      sb.append(image); sb.append(' '); 
    }
    if (imageML != null) {
      for(Iterator it = imageML.values().iterator(); it.hasNext();) {
        Object obj = it.next();
        if (obj != null) {
          sb.append(obj); sb.append(' ');
        }
      }
    }
    if (title != null) {
      sb.append(title); sb.append(' '); 
    }
    if (titleML != null) {
      for(Iterator it = titleML.values().iterator(); it.hasNext();) {
        Object obj = it.next();
        if (obj != null) {
          sb.append(obj); sb.append(' ');
        }
      }
    }
    if (titreAffiche != null) {
      sb.append(titreAffiche); sb.append(' '); 
    }
    if (titreAfficheML != null) {
      for(Iterator it = titreAfficheML.values().iterator(); it.hasNext();) {
        Object obj = it.next();
        if (obj != null) {
          sb.append(obj); sb.append(' ');
        }
      }
    }
    return new String[] {sb.toString()};
  }
  
  public String getAllWikiText() {
    StringBuffer sb = new StringBuffer(super.getAllWikiText());
    sb.ensureCapacity(500 * (0 + 1 + 0 + 0) );
    if (titreAffiche != null) {
      sb.append(titreAffiche); sb.append(' '); 
    }
    if (titreAfficheML != null) {
      for(Iterator it = titreAfficheML.values().iterator(); it.hasNext();) {
        Object obj = it.next();
        if (obj != null) {
          sb.append(obj); sb.append(' ');
        }
      }
    }
    return sb.toString();
  }
  
  public String getAllWysiwygText() {
    StringBuffer sb = new StringBuffer(super.getAllWysiwygText());
    sb.ensureCapacity(500 * (0 + 2 + 0 + 0) );
    if (contenu != null) {
      sb.append(contenu); sb.append(' '); 
    }
    if (contenuML != null) {
      for(Iterator it = contenuML.values().iterator(); it.hasNext();) {
        Object obj = it.next();
        if (obj != null) {
          sb.append(obj); sb.append(' ');
        }
      }
    }
    if (description != null) {
      sb.append(description); sb.append(' '); 
    }
    if (descriptionML != null) {
      for(Iterator it = descriptionML.values().iterator(); it.hasNext();) {
        Object obj = it.next();
        if (obj != null) {
          sb.append(obj); sb.append(' ');
        }
      }
    }
    return sb.toString();
  }
  
  public TreeSet getLinkDataSet(Class clazz) {
    if (clazz == null) {
      return Util.EMPTY_TREESET;
    }
    TreeSet set = new TreeSet();
    JcmsUtil.addData(set, clazz, getLienArticle());
    return set;
  }
  // ----------------------------------------------------------------------
  // DataController
  // ----------------------------------------------------------------------  
  public ControllerStatus checkHtmlDescription() {
    ControllerStatus status = JcmsUtil.checkHtml(description, channel.getTypeFieldLabel(this, "description"));
    if (status.hasFailed()) {
      return status;
    }
    status = JcmsUtil.checkHtml(descriptionML, channel.getTypeFieldLabel(this, "description"));
    if (status.hasFailed()) {
      return status;
    }
    return ControllerStatus.OK;
  }
  
  public ControllerStatus checkHtmlContenu() {
    ControllerStatus status = JcmsUtil.checkHtml(contenu, channel.getTypeFieldLabel(this, "contenu"));
    if (status.hasFailed()) {
      return status;
    }
    status = JcmsUtil.checkHtml(contenuML, channel.getTypeFieldLabel(this, "contenu"));
    if (status.hasFailed()) {
      return status;
    }
    return ControllerStatus.OK;
  }
  
  public ControllerStatus checkIntegrity() {
    
    ControllerStatus status = super.checkIntegrity();
    if (status.hasFailed()) {
      return status;
    }
    
    if (Util.isEmpty(getFieldInMainLanguage(titreAffiche, titreAfficheML))) {
      status = new ControllerStatus();
      status.setProp("msg.edit.empty-fieldml", channel.getTypeFieldLabel(this, "titreAffiche"), new LangProperty("lang." + getMainLanguage()));
      return status;
    }
    if (Util.isEmpty(getFieldInMainLanguage(description, descriptionML))) {
      status = new ControllerStatus();
      status.setProp("msg.edit.empty-fieldml", channel.getTypeFieldLabel(this, "description"), new LangProperty("lang." + getMainLanguage()));
      return status;
    }
    status = checkHtmlDescription();
    if (status.hasFailed()) {
      return status;
    }
    if (Util.isEmpty(getFieldInMainLanguage(contenu, contenuML))) {
      status = new ControllerStatus();
      status.setProp("msg.edit.empty-fieldml", channel.getTypeFieldLabel(this, "contenu"), new LangProperty("lang." + getMainLanguage()));
      return status;
    }
    status = checkHtmlContenu();
    if (status.hasFailed()) {
      return status;
    }
    return ControllerStatus.OK;
  }
  
  // ----------------------------------------------------------------------
  // WorkCopy
  // ----------------------------------------------------------------------  
  protected Publication prepareMergeCopy() {
    DossierThematique copy = (DossierThematique)super.prepareMergeCopy();
    DossierThematique main = (DossierThematique)mainInstance;
    JcmsUtil.mergeMLMap(copy.getTitreAfficheML(), main.getTitreAfficheML());
    JcmsUtil.mergeMLMap(copy.getDescriptionML(), main.getDescriptionML());
    JcmsUtil.mergeMLMap(copy.getImageML(), main.getImageML());
    JcmsUtil.mergeMLMap(copy.getContenuML(), main.getContenuML());
    return copy;
  }
}
// **********4A616C696F73204A434D53 *** SIGNATURE BOUNDARY ***
// aVXZSpMhbp/XxcYttIhgkw==
